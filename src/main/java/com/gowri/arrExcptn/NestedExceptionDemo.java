/**
 * @author NaveenWodeyar
 * @date 23-Nov-2026 5:18:17 pm
 */
package com.gowri.arrExcptn;


public class NestedExceptionDemo {
    public static void main(String[] args) {

        try {
            System.out.println("Outer try block started");

            try {
                int a = 10;
                int b = 0;

                int result = a / b; // ArithmeticException
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Division by zero!");
            }

            try {
                int arr[] = {10, 20, 30};

                System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index is invalid!");
            }

            System.out.println("Outer try block completed");

        } catch (Exception e) {
            System.out.println("Outer catch: " + e);
        }

        System.out.println("Program continues...");
    }
}