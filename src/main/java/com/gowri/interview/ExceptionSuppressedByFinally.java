/**
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:49:33 am
 */
package com.gowri.interview;

/**
 * Demonstrates exception suppression by finally.
 *
 * @author NaveenWodeyar
 */
public class ExceptionSuppressedByFinally {

    public static void main(String[] args) {

        int result = calculateValue();

        System.out.println("Returned value: " + result);
    }

    /**
     * Throws exceptions from try and catch blocks.
     *
     * @return value returned from finally
     */
    public static int calculateValue() {

        try {
            System.out.println("Inside try block");

            throw new ArithmeticException("Arithmetic error");

        } catch (Exception e) {

            System.out.println("Inside catch block");

            // Throws another exception.
            throw new NullPointerException("Null error");

        } finally {

            System.out.println("Inside finally block");

            // Suppresses the pending exception.
            return 50;
        }
    }
}