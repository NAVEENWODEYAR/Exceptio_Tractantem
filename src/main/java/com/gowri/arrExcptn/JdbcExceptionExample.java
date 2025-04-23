package com.gowri.arrExcptn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author NaveenWodeyar
 * @date 23-Apr-2025 3:54:31 pm
 */

public class JdbcExceptionExample {
    public static void main(String[] args) {
        // Example for MySQL (you can change this according to your DB)
        String url = "jdbc:mysql://localhost:3306/testdb"; // Change to your database
        String user = "wrongUser"; // Intentionally incorrect
        String password = "wrongPassword"; // Intentionally incorrect

        try {
            // Load JDBC driver (not needed for newer versions of JDBC)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Try connecting to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // If connection is successful (unlikely here), close it
            conn.close();
            System.out.println("Connected successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred!");
            System.out.println("Message: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            e.printStackTrace();
        }
    }
}
