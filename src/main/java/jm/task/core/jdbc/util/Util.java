package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String name = "root";
    private static final String password = "admin";
    private static final String connURL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String driverName = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection(){
        Connection conn;
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(connURL, name, password);
            System.out.println("Connection OK");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return conn;
    }
}
