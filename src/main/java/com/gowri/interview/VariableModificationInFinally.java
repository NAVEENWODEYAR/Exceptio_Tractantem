/**
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:48:00 am
 */
package com.gowri.interview;

/**
 * Demonstrates variable modification inside finally.
 *
 * @author NaveenWodeyar
 */
public class VariableModificationInFinally {

    public static void main(String[] args) {

        int number = 10;

        try {
            number = 20;

            System.out.println("Try value: " + number);

        } finally {

            // Updates the same local variable.
            number = 30;

            System.out.println("Finally value: " + number);
        }

        System.out.println("Final value: " + number);
    }
}
