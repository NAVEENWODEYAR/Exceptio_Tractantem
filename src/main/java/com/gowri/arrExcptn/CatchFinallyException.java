package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 18-Apr-2025 10:09:54 pm
 */

public class CatchFinallyException {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Try Exception");
        } catch (Exception e) {
            throw new RuntimeException("Catch Exception");
        } finally {
            throw new RuntimeException("Finally Exception");
        }
    }
}

