package com.gowri.arithmetic;

/**
 * @author NaveenWodeyar
 * @date 05-May-2025 9:36:10 pm
 */

public class MethodChainException {
    public static void main(String[] args) {
        try {
            System.out.println("Result: " + divide(getValue()));
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
    }

    static int getValue() {
        return 10;
    }

    static int divide(int x) {
        return x / getZero();
    }

    static int getZero() {
        return (int)Math.pow(0, 2);  // Returns 0 in a hidden way
    }
}
