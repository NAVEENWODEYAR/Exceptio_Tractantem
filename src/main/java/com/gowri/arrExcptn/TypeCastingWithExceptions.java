package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 25-Apr-2025 9:48:18 pm
 */

public class TypeCastingWithExceptions {

    public static void main(String[] args) {
        // ---------- Implicit Casting ----------
        int intVal = 42;
        double doubleVal = intVal;  // widening
        System.out.println("Implicit casting int to double: " + doubleVal);

        // ---------- Explicit Casting ----------
        double num = 99.99;
        int intCasted = (int) num;  // narrowing (no exception, but data loss)
        System.out.println("Explicit casting double to int: " + intCasted);

        // ---------- Possible Exception 1: NumberFormatException ----------
        try {
            String invalidNumber = "123abc";
            int parsed = Integer.parseInt(invalidNumber); // will throw
            System.out.println("Parsed number: " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // ---------- Possible Exception 2: ClassCastException ----------
        try {
            Object obj = "Hello";
            Integer wrongCast = (Integer) obj; // invalid cast
            System.out.println("Casted value: " + wrongCast);
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }

        // ---------- Safe Object Casting using instanceof ----------
        Object value = "Java";
        if (value instanceof String) {
            String str = (String) value;
            System.out.println("Safely casted object to String: " + str);
        }

        // ---------- Overflow Example ----------
        int largeInt = 300;
        byte overflowByte = (byte) largeInt;  // causes overflow
        System.out.println("Overflowed byte value: " + overflowByte); // will be 44
    }
}

