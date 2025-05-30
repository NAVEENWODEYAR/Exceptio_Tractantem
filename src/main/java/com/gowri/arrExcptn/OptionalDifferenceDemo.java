package com.gowri.arrExcptn;

import java.util.Optional;

/**
 * @author NaveenWodeyar
 * @date 30-May-2025 6:05:43 pm
 */

public class OptionalDifferenceDemo {
    public static void main(String[] args) {
        String value1 = "Hello, Optional!";
        String value2 = null;

        System.out.println("===== Case 1: Optional.of() with non-null value =====");
        try {
            Optional<String> opt1 = Optional.of(value1);
            System.out.println("opt1: " + opt1.get());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("\n===== Case 2: Optional.of() with null value =====");
        try {
            Optional<String> opt2 = Optional.of(value2);  // ❌ Will throw NullPointerException
            System.out.println("opt2: " + opt2.get());
        } catch (Exception e) {
            System.out.println("Exception: " + e);  // Expected
        }

        System.out.println("\n===== Case 3: Optional.ofNullable() with non-null value =====");
        try {
            Optional<String> opt3 = Optional.ofNullable(value1);
            System.out.println("opt3: " + opt3.get());
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }

        System.out.println("\n===== Case 4: Optional.ofNullable() with null value =====");
        try {
            Optional<String> opt4 = Optional.ofNullable(value2);
            System.out.println("opt4 is present: " + opt4.isPresent());
            System.out.println("opt4: " + opt4.orElse("Default Value"));
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
