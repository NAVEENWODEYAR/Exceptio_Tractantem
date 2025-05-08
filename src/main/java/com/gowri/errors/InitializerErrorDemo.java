package com.gowri.errors;

/**
 * @author NaveenWodeyar
 * @date 08-May-2025 10:44:41 pm
 */

public class InitializerErrorDemo {
    static int value = 10 / 0; // Causes ArithmeticException

    public static void main(String[] args) {
        System.out.println("This won't run.");
    }
}

