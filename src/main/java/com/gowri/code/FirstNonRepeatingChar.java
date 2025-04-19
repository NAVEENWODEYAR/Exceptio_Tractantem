package com.gowri.code;

/**
 * @author NaveenWodeyar
 * @date 19-Apr-2025 10:14:41 pm
 */

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        boolean found = false;

        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating characters found.");
        }
    }
}
