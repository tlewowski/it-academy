package com;

import java.sql.*;

public class PostgresExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres")) {

            System.out.println("Java JDBC PostgreSQL Example");
            // When this class first attempts to establish a connection, it automatically loads any JDBC 4.0 drivers found within
            // the class path. Note that your application must manually load any JDBC drivers prior to version 4.0.
//          Class.forName("org.postgresql.Driver");

            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            statement.execute("insert into deals (did, transactionId, price, tax) values (1, 2, 3, 4),(4, 3, 2, 1)");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM public.deals");
            while (resultSet.next()) {
                System.out.println(String.format("%s for %s", resultSet.getString("price"), resultSet.getString("did")));
            }

        } /*catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC driver not found.");
            e.printStackTrace();
        }*/ catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}
