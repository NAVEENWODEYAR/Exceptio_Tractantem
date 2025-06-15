package com.gowri.errors;

/**
 * @author NaveenWodeyar
 * @date 15-Jun-2025 8:48:42 pm
 */

public class StackOverflowHandled {

    public static void recursiveMethod() {
        // This will cause infinite recursion
        recursiveMethod();
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError caught!");
            e.printStackTrace();
        }
        System.out.println("Program continues after handling the error.");
    }
}
