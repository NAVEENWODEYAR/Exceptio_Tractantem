package com.gowri.errors;

/**
 * @author NaveenWodeyar
 * @date 13-Jun-2025 10:09:02 pm
 */

public class OnlyErrorsExample {

    // Cause StackOverflowError by infinite recursion
    public static void causeStackOverflow() {
        causeStackOverflow();
    }

    public static void main(String[] args) {
        try {
            // 1. StackOverflowError
            System.out.println("Causing StackOverflowError...");
            causeStackOverflow();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError!");
        }

        try {
            // 2. OutOfMemoryError by trying to allocate huge array
            System.out.println("Causing OutOfMemoryError...");
            int[] hugeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.out.println("Caught OutOfMemoryError!");
        }

        try {
            // 3. NoClassDefFoundError (simulate by loading a non-existing class)
            System.out.println("Causing NoClassDefFoundError...");
            Class.forName("non.existing.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException (checked exception).");
        } catch (NoClassDefFoundError e) {
            System.out.println("Caught NoClassDefFoundError!");
        }

        System.out.println("Program finished.");
    }
}
