package com.gowri.arrExcptn;

import java.util.*;

/**
 * @author NaveenWodeyar
 * @date 25-Apr-2025 9:52:56 pm
 */

public class AutoboxingCast {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(100); // int → Integer → Object

        try {
            String str = (String) list.get(0); // Wrong cast
        } catch (ClassCastException e) {
            System.out.println("Autoboxing trap: " + e.getMessage());
        }
    }
}

