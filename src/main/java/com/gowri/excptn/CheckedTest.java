package com.gowri.excptn;

import java.io.IOException;

/**
 * @author NaveenWodeyar
 * @date 24-Apr-2025 9:59:02 pm
 * public class CheckedTest {
    public static void main(String[] args) {
        throw new IOException("Oops"); // Compile-time error
    }
}

 */

public class CheckedTest {
    public static void main(String[] args) throws IOException {
        throw new IOException("Oops"); // Compile-time error
    }
}

