package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 31-Mar-2025 9:15:14 pm
 */

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = 10 / 0; // ArithmeticException
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
            String str = null;
            System.out.println(str.length()); // NullPointerException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}

