package com.gowri.arrExcptn;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author NaveenWodeyar
 * @date 09-Jun-2025 9:57:35 pm
 */

public class DivisionCalculator {

    // Create a Logger instance
    private static final Logger logger = Logger.getLogger(DivisionCalculator.class.getName());

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter numerator: ");
            int numerator = Integer.parseInt(reader.readLine());

            System.out.print("Enter denominator: ");
            int denominator = Integer.parseInt(reader.readLine());

            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            logger.log(Level.SEVERE, "Invalid number format", e);
            System.out.println("❌ Error: Please enter valid integers.");
        } catch (ArithmeticException e) {
            logger.log(Level.SEVERE, "Arithmetic error", e);
            System.out.println("❌ Error: Cannot divide by zero.");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected error", e);
            System.out.println("❌ An unexpected error occurred. Please try again.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
