package com.gowri.excptn;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 * @date 02-Jun-2025 8:13:20 pm
 */

public class OptionalExample {
    public static void main(String[] args) {
        try {
            // Creating an Optional with a non-null value
            Optional<String> optionalWithValue = Optional.of("Hello, Optional!");

            // Creating an Optional that is explicitly empty
            Optional<String> optionalEmpty = Optional.empty();

            // Creating an Optional from a possibly null value
            String str = null;
            Optional<String> optionalNullable = Optional.ofNullable(str);

            // Printing Optional values directly
            System.out.println("Optional with value: " + optionalWithValue);
            System.out.println("Empty Optional: " + optionalEmpty);
            System.out.println("Optional from nullable: " + optionalNullable);

            // Checking if value is present before printing
            if (optionalWithValue.isPresent()) {
                System.out.println("Value is present: " + optionalWithValue.get());
            }

            // Safely using get() inside a try-catch
            try {
                // This will throw NoSuchElementException because it's empty
                String value = optionalEmpty.get(); 
                System.out.println("Value from optionalEmpty: " + value);
            } catch (Exception e) {
                System.out.println("Exception caught while calling get() on empty Optional: " + e.getMessage());
            }

            // Using ifPresent to avoid null checks
            optionalWithValue.ifPresent(value -> System.out.println("ifPresent: " + value));

            // Using orElse to provide a default value
            System.out.println("Nullable orElse: " + optionalNullable.orElse("Default Value"));

            // Using orElseThrow with a custom exception
            String result = optionalNullable.orElseThrow(() -> new IllegalStateException("Value is missing!"));
            System.out.println("Result from orElseThrow: " + result);

        } catch (IllegalStateException e) {
            System.out.println("Caught IllegalStateException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general exception: " + e.getMessage());
        }
    }
}
