package com.gowri.excptn;

import java.io.*; // For IOException
import java.sql.*; // For SQLException

/**
 * @author NaveenWodeyar
 * @date 21-Jul-2025 11:18:16 pm
 */

public class ExceptionLevelsExample {

    // Method throwing a checked exception (IOException)
    void readFile() throws IOException {
        System.out.println("Reading a file...");
        FileReader fr = new FileReader("file.txt"); // File may not exist
        fr.read();
        fr.close();
    }

    // Method throwing another checked exception (SQLException)
    void connectDatabase() throws SQLException {
        System.out.println("Connecting to database...");
        throw new SQLException("Database not found!");
    }

    // Method throwing an unchecked exception (ArithmeticException)
    void divideNumbers() {
        System.out.println("Dividing numbers...");
        int result = 10 / 0; // Will throw ArithmeticException
        System.out.println("Result: " + result);
    }

    // Method throwing another unchecked exception (NullPointerException)
    void accessNullObject() {
        System.out.println("Accessing null object...");
        String str = null;
        System.out.println(str.length()); // Will throw NullPointerException
    }

    // Method with no exceptions
    void greet() {
        System.out.println("Hello! No exceptions here.");
    }

    // Main method
    public static void main(String[] args) {
        ExceptionLevelsExample example = new ExceptionLevelsExample();

        // Handle checked exception
        try {
            example.readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        try {
            example.connectDatabase();
        } catch (SQLException e) {
            System.out.println("Caught SQLException: " + e.getMessage());
        }

        // Handle unchecked exceptions
        try {
            example.divideNumbers();
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        try {
            example.accessNullObject();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // Call method without exception
        example.greet();

        System.out.println("Program completed.");
    }
}
