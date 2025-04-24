package com.gowri.excptn;

/**
 * @author NaveenWodeyar
 * @date 24-Apr-2025 10:00:09 pm
 */

public class NPEInCatch {
    public static void main(String[] args) {
        try {
            int x = 5 / 0;
        } catch (Exception e) {
            e = null;
            System.out.println(e.getMessage()); // NPE here
        }
    }
}

