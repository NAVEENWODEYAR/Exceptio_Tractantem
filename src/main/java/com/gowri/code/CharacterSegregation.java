/**
 * @author NaveenWodeyar
 * @date 16-Sept-2026 8:42:53 am
 */
package com.gowri.code;

/**
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

        // StringBuilder is used because String concatenation
        // inside a loop can create many unnecessary String objects.
        StringBuilder alphabets = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        StringBuilder specialChars = new StringBuilder();

        // Traverse the string exactly once.
        for (char ch : input.toCharArray()) {

            if (Character.isLetter(ch)) {
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                digits.append(ch);
            } else {
                specialChars.append(ch);
            }
        }

        return new String[] {
            alphabets.toString(),
            digits.toString(),
            specialChars.toString()
        };
    }

    /**
     * Prints the segregation result.
     */
    public static void main(String[] args) {

        String input = "Ja@va123#Pro!";

        String[] result = segregateCharacters(input);

        System.out.println("Alphabets : " + result[0]);
        System.out.println("Digits    : " + result[1]);
        System.out.println("Special   : " + result[2]);
    }
}
