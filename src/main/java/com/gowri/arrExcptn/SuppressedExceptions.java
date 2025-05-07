package com.gowri.arrExcptn;

/**
 * @author NaveenWodeyar
 * @date 07-May-2025 8:58:22 pm
 */

public class SuppressedExceptions {

    public static void main(String[] args) throws Exception {
        try (MyResource r = new MyResource()) {
            throw new RuntimeException("Main Exception");
        }
    }
}

class MyResource implements AutoCloseable {
    public void close() {
        throw new RuntimeException("Suppressed Exception");
    }
}
