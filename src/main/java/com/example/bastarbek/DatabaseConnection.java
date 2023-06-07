package com.example.bastarbek;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private final String url = "jdbc:postgresql://localhost:5432/azamat";
    private final String user = "postgres";
    private final String password = "aidos2308";
    public Connection databaseLink;
    public Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");
            databaseLink = DriverManager.getConnection(url, user, password);
            System.out.println("db connected");
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }
}
