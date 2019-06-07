package com.reporters;

import com.Deal;

import java.nio.file.Path;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class SQLLoader {
    public List<Deal> fromDB() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");

            Statement statement = connection.createStatement();
            //statement.execute("insert into deals (id, transactionId, price, tax) values (1, 2, 3, 4),(4, 3, 2, 1)");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.vdeals");
            List<Deal> list = new LinkedList<>();
            while (resultSet.next()) {
                //System.out.println(String.format("%s for %s", resultSet.getString("price"), resultSet.getString("id")));
                list.add(new Deal(resultSet.getInt("did"),
                        resultSet.getInt("transactionid"),
                        resultSet.getDouble("price"),
                        resultSet.getDouble("tax")));
            }

        return list;
    }
}
