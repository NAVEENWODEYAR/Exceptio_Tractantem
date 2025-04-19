package com.gowri.code;

/**
 * @author NaveenWodeyar
 * @date 19-Apr-2025 10:13:54 pm
 */

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
