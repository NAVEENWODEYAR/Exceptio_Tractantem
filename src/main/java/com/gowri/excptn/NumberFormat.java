package com.gowri.excptn;

/**
 * @author NaveenWodeyar
 * @date 16-May-2025 2:22:55 pm
 */

public class NumberFormat {
    public static void main(String[] args) {
        String s = "123a";
        try {
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + s);
        }
    }
}

