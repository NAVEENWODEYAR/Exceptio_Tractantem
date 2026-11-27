/**
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:47:29 am
 */
package com.gowri.interview;

/**
 * Demonstrates nested try-catch-finally execution.
 *
 * @author NaveenWodeyar
 */
public class NestedTryCatchFinally {

    public static void main(String[] args) {

        try {
            System.out.println("A");

            try {
                System.out.println("B");

                int result = 10 / 0;

            } catch (NullPointerException e) {

                // Does not handle ArithmeticException.
                System.out.println("C");

            } finally {

                // Inner finally executes first.
                System.out.println("D");
            }

            System.out.println("E");

        } catch (ArithmeticException e) {

            // Handles the propagated exception.
            System.out.println("F");

        } finally {

            // Outer finally executes next.
            System.out.println("G");
        }

        System.out.println("H");
    }
}