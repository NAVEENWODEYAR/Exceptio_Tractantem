package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 25-Apr-2025 9:51:48 pm
 */

public class TrickyTypeCastingExamples {

    public static void main(String[] args) {

        // 1. Widening - Safe (int to double)
        int i = 42;
        double d = i;
        System.out.println("Widening int to double: " + d);

        // 2. Narrowing - Valid, but truncates (double to int)
        double pi = 3.14159;
        int intPi = (int) pi;
        System.out.println("Narrowing double to int (data loss): " + intPi);

        // 3. Overflow in primitive cast
        int bigInt = 130;
        byte overflowByte = (byte) bigInt; // 130 % 256 = -126
        System.out.println("Overflow casting int 130 to byte: " + overflowByte);

        // 4. Negative byte to unsigned char
        byte negative = -1;
        char charFromByte = (char) negative;
        System.out.println("Casting byte -1 to char (unsigned): " + (int) charFromByte);

        // 5. Char to int and back
        char ch = 'A';
        int ascii = ch;
        char next = (char) (ascii + 1);
        System.out.println("Char to int: " + ascii + ", next char: " + next);

        // 6. Invalid Object casting (ClassCastException)
        try {
            Object obj = "Hello";
            Integer wrong = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Exception - ClassCastException: " + e.getMessage());
        }

        // 7. Safe object casting using instanceof
        Object maybeString = "Java";
        if (maybeString instanceof String) {
            String str = (String) maybeString;
            System.out.println("Safe cast with instanceof: " + str);
        }

        // 8. NumberFormatException when parsing
        try {
            String badNumber = "123abc";
            int parsed = Integer.parseInt(badNumber);
        } catch (NumberFormatException e) {
            System.out.println("Exception - NumberFormatException: " + e.getMessage());
        }

        // 9. Ternary with mixed types
        int a = 10;
        double b = 20.5;
        double result = true ? a : b;  // int is promoted to double
        System.out.println("Ternary with mixed types (int, double): " + result);

        // 10. Object casting from collection (Autoboxing issue)
        try {
            Object boxed = 100;  // int → Integer → Object
            String failCast = (String) boxed; // Wrong type
        } catch (ClassCastException e) {
            System.out.println("Exception - Autoboxing trap: " + e.getMessage());
        }

        // 11. Explicit cast causing silent truncation
        long bigLong = 1234567890123L;
        int smallInt = (int) bigLong;  // Silent overflow
        System.out.println("Casting long to int (overflow risk): " + smallInt);
    }
}
