package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 18-Apr-2025 10:09:54 pm
 */


public class CatchFinallyException {
	
    public static void main(String[] args) {

        try {
            System.out.println("Inside try block");

            int a = 10 / 0;  // ArithmeticException
        }

        catch (ArithmeticException e) {
            System.out.println("Inside catch block");

            int arr[] = {1, 2, 3};

            // Exception inside catch block
            System.out.println(arr[5]);
        }

        finally {
            System.out.println("Inside finally block");

            int x = 10 / 0;  // Exception inside finally
        }

        System.out.println("End of program");
    }
}


