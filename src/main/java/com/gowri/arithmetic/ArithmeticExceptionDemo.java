/**
 * @author NaveenWodeyar
 * @date 22-Sept-2026 11:17:37 pm
 */
package com.gowri.arithmetic;

public class ArithmeticExceptionDemo {

    public static void main(String[] args) {

        System.out.println("Program started");

        try {
            int a = 10;
            int b = 0;

            System.out.println("Before division");

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            System.out.println("ArithmeticException caught");
            System.out.println("Message: " + e.getMessage());

        } finally {

            System.out.println("Finally block executed");
        }

        System.out.println("Program ended");
    }
}
