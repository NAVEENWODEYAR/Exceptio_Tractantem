package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 09-May-2025 10:39:24 pm
 */

public class ArrayStoreDemo {
    public static void main(String[] args) {
        Object[] objArray = new String[2];
        objArray[0] = new Integer(10); // ArrayStoreException
    }
}

