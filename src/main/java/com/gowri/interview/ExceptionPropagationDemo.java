/**
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:48:26 am
 */
package com.gowri.interview;

/**
 * Demonstrates exception propagation through method calls.
 *
 * @author NaveenWodeyar
 */
public class ExceptionPropagationDemo {

    public static void main(String[] args) {

        try {
            methodOne();

        } catch (ArithmeticException e) {

            // Exception is handled in the main method.
            System.out.println("Exception caught in main method");
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("End of program");
    }

    /**
     * Calls methodTwo().
     */
    public static void methodOne() {
        System.out.println("Inside methodOne()");
        methodTwo();
    }

    /**
     * Calls methodThree().
     */
    public static void methodTwo() {
        System.out.println("Inside methodTwo()");
        methodThree();
    }

    /**
     * Generates an ArithmeticException.
     */
    public static void methodThree() {
        System.out.println("Inside methodThree()");

        int result = 10 / 0;
    }
}