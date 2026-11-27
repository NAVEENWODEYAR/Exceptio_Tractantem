/**
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:48:55 am
 */
package com.gowri.interview;

/**
 * Demonstrates System.exit() behavior with finally.
 *
 * @author NaveenWodeyar
 */
public class SystemExitFinallyDemo {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

            // Terminates the JVM.
            System.exit(0);

        } catch (Exception e) {

            System.out.println("Inside catch block");

        } finally {

            // Normally does not execute after System.exit().
            System.out.println("Inside finally block");
        }

        System.out.println("End of program");
    }
}