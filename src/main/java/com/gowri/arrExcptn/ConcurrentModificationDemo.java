/**
 * @author NaveenWodeyar
 * @date 09-May-2025 10:39:58 pm
 */
package com.gowri.arrExcptn;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        Iterator<String> iterator = list.iterator();
        list.add("C"); // ConcurrentModificationException
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
