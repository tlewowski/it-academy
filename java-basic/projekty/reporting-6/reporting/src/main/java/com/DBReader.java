package com;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DBReader {
    public <T> List<T> get (Class<T> cls) throws Exception {
        InDB a = cls.getAnnotation(InDB.class);
        if (a == null) {
            throw new RuntimeException("Bang");
        }

        String fromWhere = a.tableName();

        Field[] fields = cls.getFields();
        ArrayList<String> names = new ArrayList<>();
        for (Field f : fields) {
            names.add(f.getName());
        }

        String queryTemplate = "select %s from %s";
        String query = String.format(queryTemplate, String.join(",", names), fromWhere);
        System.out.println(query);
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        Statement statement = connection.createStatement();
        // statement.execute("insert into deals (did, transactionId, price, tax) values (1, 2, 3, 4),(4, 3, 2, 1)");
        ResultSet resultSet = statement.executeQuery(query);
        List<T> lista = new LinkedList<>();
        while (resultSet.next()) {
            T currentDeal = cls.newInstance();
            for (Field f: fields) {
                System.out.print(resultSet.getString(f.getName()));
                System.out.print(",");
                Object value = getValue(resultSet, f);//f.getType().newInstance(resultSet.getString(f.getName()));
                f.set(currentDeal, value);
            }
            lista.add(currentDeal);
            System.out.println();
        }
        for(Field f: cls.getFields()) {

            System.out.println(f.getType().getName());
            //f.set(currentDeal, value);
        }

        System.out.println(names);

        return lista;
    }

    Object getValue(ResultSet rs, Field f) throws Exception {
        String typename = f.getType().getName();
        if(typename.equals("int")) {
            return rs.getInt(f.getName());
        } else if(typename.equals("double")) {
            return rs.getDouble(f.getName());
        } else throw new Exception();
    }
}
