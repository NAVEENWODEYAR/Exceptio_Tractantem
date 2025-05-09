package com.gowri.errors;

/**
 * @author NaveenWodeyar
 * @date 09-May-2025 10:38:25 pm
 */

public class StackOverflowDemo {
    public static void recursiveMethod() {
        recursiveMethod(); // Infinite recursion
    }

    public static void main(String[] args) {
        recursiveMethod(); // StackOverflowError
    }
}
