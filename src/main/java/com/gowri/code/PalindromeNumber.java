package com.gowri.code;

import java.util.Scanner;

/**
 * This program checks whether a given number is a palindrome.
 *
 * A palindrome number is a number that remains the same
 * when its digits are reversed.
 *
 * Examples:
 *
 * 121  -> Palindrome
 * 123  -> Not a palindrome
 * 1001 -> Palindrome
 *
 * @author NaveenWodeyar
 * @date 19-Apr-2025 10:13:54 pm
 */
public class PalindromeNumber {

    /**
     * Checks whether the given number is a palindrome.
     *
     * The number is reversed digit by digit and then
     * compared with the original number.
     *
     * @param num the number to be checked
     */
    static void palindromeNumber(int num) {

        /*
         * Store the original number because the value of
         * 'num' will change while reversing the number.
         */
        int original = num;

        // Variable used to store the reversed number.
        int reversed = 0;

        /*
         * Extract each digit from the number and construct
         * the reversed number.
         *
         * Example:
         *
         * num = 121
         *
         * First iteration:
         * digit = 1
         * reversed = 0 * 10 + 1 = 1
         *
         * Second iteration:
         * digit = 2
         * reversed = 1 * 10 + 2 = 12
         *
         * Third iteration:
         * digit = 1
         * reversed = 12 * 10 + 1 = 121
         */
        while (num != 0) {

            // Extract the last digit of the number.
            int digit = num % 10;

            /*
             * Add the extracted digit to the reversed number.
             *
             * Multiplying by 10 shifts the existing digits
             * one position to the left.
             */
            reversed = reversed * 10 + digit;

            /*
             * Remove the last digit from the original number.
             *
             * Example:
             * 121 / 10 = 12
             * 12  / 10 = 1
             * 1   / 10 = 0
             */
            num /= 10;
        }

        /*
         * Compare the original number with the reversed number.
         *
         * If both are equal, the number is a palindrome.
         */
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    /**
     * Main method - program execution starts here.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of test cases.
        System.out.println("Enter the number of test cases: ");
        int n = scanner.nextInt();

        /*
         * Execute the palindrome check for each test case.
         *
         * We use i < n instead of i <= n.
         *
         * Example:
         * If n = 3,
         * i = 0, 1, 2
         *
         * Therefore, exactly 3 test cases are processed.
         */
        for (int i = 0; i < n; i++) {

            // Ask the user to enter a number.
            System.out.println("Enter the number: ");
            int j = scanner.nextInt();

            // Check whether the entered number is a palindrome.
            palindromeNumber(j);
        }

        // Close the Scanner object.
        scanner.close();
    }
}

/*
 * =====================================================================
 *                     TIME AND SPACE COMPLEXITY
 * =====================================================================
 *
 * Let D = number of digits in the given number.
 *
 *
 * TIME COMPLEXITY:
 * ----------------
 *
 * The while loop processes one digit during every iteration.
 *
 * For example, if the number is:
 * 
 *
 * 12345
 *
 * The loop executes 5 times because the number has 5 digits.
 *
 * Therefore:
 *
 * Time Complexity = O(D)
 *
 * If N represents the value of the number, the number of digits
 * is approximately log10(N).
 *
 * Therefore:
 *
 * Time Complexity = O(log N)
 *
 *
 * SPACE COMPLEXITY:
 * -----------------
 *
 * Only a fixed number of variables are used:
 *
 * original
 * reversed
 * digit
 *
 * No additional data structure is created.
 *
 * Therefore:
 *
 * Space Complexity = O(1)
 *
 * This is an iterative solution, so there is no recursive
 * call stack.
 *
 *
 * FINAL COMPLEXITY:
 *
 * Time Complexity  = O(D) = O(log N)
 * Space Complexity = O(1)
 *
 * =====================================================================
 */
