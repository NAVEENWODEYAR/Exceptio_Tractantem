package com.gowri.arithmetic;

/**
 * @author NaveenWodeyar
 * @date 27-Aug-2026 11:16:34 pm
 * Demonstrates how Java handles positive and negative infinity
 * during floating-point arithmetic.
 *
 * <p>Java's {@code double} type follows IEEE 754 floating-point
 * arithmetic and supports positive infinity, negative infinity,
 * and NaN (Not a Number).
 * </p>
 */
public class InfinityDemo {

    /**
     * Returns the result of dividing {@code numerator} by
     * {@code denominator}.
     *
     * @param numerator   the numerator
     * @param denominator the denominator
     * @return the result of the division
     */
    public static double divide(double numerator, double denominator) {
        return numerator / denominator;
    }

    
    /**
     * Checks whether a given number represents positive
     * or negative infinity.
     *
     * @param number the number to check
     * @return {@code true} if the number is infinite,
     *         otherwise {@code false}
     */
    public static boolean isInfinity(double number) {
        return Double.isInfinite(number);
    }

    
    /**
     * Main method containing LeetCode-style test cases.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Test Case 1: Positive number divided by zero
        double result1 = divide(10.0, 0.0);
        System.out.println("Test Case 1: " + result1);
        System.out.println("Expected: Infinity");
        System.out.println("Pass: " + (result1 == Double.POSITIVE_INFINITY));

        // Test Case 2: Negative number divided by zero
        double result2 = divide(-10.0, 0.0);
        System.out.println("\nTest Case 2: " + result2);
        System.out.println("Expected: -Infinity");
        System.out.println("Pass: " + (result2 == Double.NEGATIVE_INFINITY));

        // Test Case 3: Infinity + finite number
        double infinity = Double.POSITIVE_INFINITY;
        double result3 = infinity + 100;

        System.out.println("\nTest Case 3: " + result3);
        System.out.println("Expected: Infinity");
        System.out.println("Pass: " + (result3 == Double.POSITIVE_INFINITY));

        // Test Case 4: Infinity - Infinity
        double result4 = infinity - infinity;

        System.out.println("\nTest Case 4: " + result4);
        System.out.println("Expected: NaN");
        System.out.println("Pass: " + Double.isNaN(result4));

        // Test Case 5: Infinity / Infinity
        double result5 = infinity / infinity;

        System.out.println("\nTest Case 5: " + result5);
        System.out.println("Expected: NaN");
        System.out.println("Pass: " + Double.isNaN(result5));
    }
    
}

