/**
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:45:28 am
 */
package com.gowri.interview;

/**
 * Demonstrates exception handling inside finally.
 *
 * @author NaveenWodeyar
 */
public class ExceptionInsideFinally {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

            int result = 10 / 0;

        } catch (ArithmeticException e) {

            System.out.println("Inside catch block");

            // Throwing another exception from catch.
            throw new NullPointerException("Null exception");

        } finally {

            System.out.println("Inside finally block");

            // This exception overrides the pending exception.
            int result = 20 / 0;
        }
    }
}