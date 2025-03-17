package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 17-Mar-2025 9:36:27 am
 */

public class FinallyBlock {

	public static void main(String[] args) {
        try {
            System.out.println("In try block");
            return;
        } catch (Exception e) {
            System.out.println("In catch block");
        } finally {
            System.out.println("In finally block");
            return;
        }
}}
