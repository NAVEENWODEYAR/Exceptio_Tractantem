package com.gowri.arrExcptn;

import java.io.*;
import java.util.logging.*;

/**
 * @author NaveenWodeyar
 * @date 09-Jun-2025 10:01:36 pm
 */

public class FileDivisionProcessor {

    private static final Logger logger = Logger.getLogger(FileDivisionProcessor.class.getName());

    static {
        try {
            LogManager.getLogManager().reset();
            logger.setLevel(Level.ALL);

            FileHandler fh = new FileHandler("file_processor.log", true);
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);

        } catch (IOException e) {
            System.err.println("Logging setup failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        File file = new File("numbers.txt");

        if (!file.exists()) {
            System.out.println("❌ File not found: " + file.getAbsolutePath());
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNum = 1;

            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");
                    if (parts.length != 2) {
                        throw new IllegalArgumentException("Line must contain exactly two comma-separated values.");
                    }

                    int a = Integer.parseInt(parts[0].trim());
                    int b = Integer.parseInt(parts[1].trim());

                    int result = divide(a, b);
                    System.out.println("✅ Line " + lineNum + " result: " + a + " / " + b + " = " + result);

                } catch (NumberFormatException e) {
                    logger.log(Level.SEVERE, "Line " + lineNum + " has invalid number format: " + line, e);
                    System.out.println("❌ Line " + lineNum + " error: " + e.getMessage());
                } catch (ArithmeticException e) {
                    logger.log(Level.SEVERE, "Line " + lineNum + " caused division error: " + line, e);
                    System.out.println("❌ Line " + lineNum + " error: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    logger.log(Level.WARNING, "Line " + lineNum + " is improperly formatted: " + line, e);
                    System.out.println("❌ Line " + lineNum + " error: " + e.getMessage());
                } catch (Exception e) {
                    logger.log(Level.SEVERE, "Unexpected error on line " + lineNum + ": " + line, e);
                    System.out.println("❌ Line " + lineNum + " unexpected error: " + e.getMessage());
                }
                lineNum++;
            }

        } catch (IOException e) {
            logger.log(Level.SEVERE, "I/O error while reading the file", e);
            System.out.println("❌ File read error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
