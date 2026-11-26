package com.gowri.interview;

/**
 * Demonstrates how finally overrides the return value from try.
 * @author NaveenWodeyar
 * @date 26-Nov-2026 8:39:17 am
 */
public class ReturnInTryFinally {

    public static void main(String[] args) {
        System.out.println("Returned value: " + calculateValue());
    }

    /**
     * Returns a value from try and finally blocks.
     *
     * @return the value returned by finally
     */
    public static int calculateValue() {

        try {
            System.out.println("Inside try block");
            return 10;

        } finally {
            System.out.println("Inside finally block");

            // This return overrides the try return.
            return 20;
        }
    }
}