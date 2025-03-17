package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 17-Mar-2025 9:41:47 am
 */

public class ExceptionInFinallyBlock {

	public static void main(String[] args) {
        try {
            System.out.println("In try block");
            int result = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block");
            throw new RuntimeException("Exception in finally block");
        }
    }
}
