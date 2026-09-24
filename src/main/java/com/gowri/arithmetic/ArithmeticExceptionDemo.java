package com.gowri.arithmetic;

/**
 * Demonstrates ArithmeticException using try-catch-finally.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Reason:
 * - No loops
 * - No recursion
 * - Fixed number of operations
 * - Fixed number of variables
 */
public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        /*
         * TIME COMPLEXITY: O(1)
         *
         * All statements execute a fixed number of times.
         * There are no loops or recursive calls.
         */

        /*
         * SPACE COMPLEXITY: O(1)
         *
         * Only a fixed amount of memory is used for:
         * - int variables: a, b, result
         * - Exception reference: e
         *
         * Memory does not grow with input size.
         */

        try {

            int a = 10;
            int b = 0;

            System.out.println("Before division");

            /*
             * Division by zero causes ArithmeticException.
             *
             * After the exception occurs, the remaining statements
             * in the try block are skipped.
             */
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            /*
             * The ArithmeticException is caught here.
             */
            System.out.println("ArithmeticException caught");
            System.out.println("Message: " + e.getMessage());
            System.out.println("Exception: " + e);

        } finally {

            /*
             * The finally block executes after try/catch.
             */
            System.out.println("Finally block executed");
        }

        /*
         * Program continues after the exception has been handled.
         */
        System.out.println("Program ended");
    }
}