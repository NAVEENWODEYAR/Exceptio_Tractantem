/**
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:47:01 am
 */
package com.gowri.interview;

/**
 * Demonstrates multiple catch blocks.
 *
 * @author NaveenWodeyar
 */
public class ExceptionHierarchyDemo {

    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

            int result = 10 / 0;

        } catch (NullPointerException e) {

            System.out.println("NullPointerException handled");

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException handled");

        } catch (Exception e) {

            // Handles other exceptions.
            System.out.println("General exception handled");
        }

        System.out.println("End of program");
    }
}