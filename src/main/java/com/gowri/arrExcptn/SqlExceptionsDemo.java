package com.gowri.arrExcptn;

import java.sql.*;

/**
 * @author NaveenWodeyar
 * @date 23-Apr-2025 4:04:36 pm
 */


public class SqlExceptionsDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root"; // Replace with actual user
        String password = "password"; // Replace with actual password

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // 1. SQLSyntaxErrorException - wrong table name
            try {
                stmt.executeQuery("SELECT * FROM non_existing_table");
            } catch (SQLSyntaxErrorException e) {
                System.out.println("Syntax Error: " + e.getMessage());
            }

            // 2. SQLIntegrityConstraintViolationException - duplicate primary key
            try {
                stmt.executeUpdate("INSERT INTO users (id, name) VALUES (1, 'Alice')"); // assume 1 already exists
            } catch (SQLIntegrityConstraintViolationException e) {
                System.out.println("Integrity Constraint Violation: " + e.getMessage());
            }

            // 3. SQLDataException - wrong data type
            try {
                stmt.executeUpdate("INSERT INTO users (id, name) VALUES ('text', 'Bob')"); // 'text' into an int field
            } catch (SQLDataException e) {
                System.out.println("Data Error: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.out.println("General SQL Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

