package com.gowri.code;

import java.util.Scanner;

/**
 * 
 * @author NaveenWodeyar
 * @date 16-Sept-2026 8:42:53 am
 * 
 * Segregates characters of a string into:
 * 1. Alphabets
 * 2. Digits
 * 3. Special characters
 *
 * The relative order of characters within each category is preserved.
 */
public class CharacterSegregation {

    /**
     * Segregates the given string into alphabets, digits, and
     * special characters.
     *
     * @param input the input string
     * @return a String array containing:
     *         [0] -> alphabets
     *         [1] -> digits
     *         [2] -> special characters
     */
    public static String[] segregateCharacters(String input) {

        // StringBuilder is used to efficiently store characters
        // belonging to each category.
        StringBuilder alphabets = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        // Traverse the string exactly once.
        for (char ch : input.toCharArray()) {

            // Check whether the character is an alphabet.
            if (Character.isLetter(ch)) {
                alphabets.append(ch);

            // Check whether the character is a digit.
            } else if (Character.isDigit(ch)) {
                digits.append(ch);

            // Any character other than alphabet and digit
            // is considered a special character.
            } else {
                specialChars.append(ch);
            }
        }

        // Return the three categories as a String array.
        return new String[] {
            alphabets.toString(),
            digits.toString(),
            specialChars.toString()
        };
    }

    /**
     * Main method to read multiple test cases from the user
     * and display the segregated characters.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int n = scanner.nextInt();

        // Consume the leftover newline after nextInt().
        scanner.nextLine();

        // Process exactly n test cases.
        for (int i = 1; i <= n; i++) {

            System.out.print("Enter the value for test case " + i + ": ");
            String str = scanner.nextLine();

            // Call the method and store the returned result.
            String[] result = segregateCharacters(str);

            // Display the result.
            System.out.println("Alphabets       : " + result[0]);
            System.out.println("Digits          : " + result[1]);
            System.out.println("Special Chars   : " + result[2]);

            System.out.println();
        }

        scanner.close();
    }
}
