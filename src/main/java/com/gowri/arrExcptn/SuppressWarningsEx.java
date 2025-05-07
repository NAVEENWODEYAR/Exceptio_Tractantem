package com.gowri.arrExcptn;

import java.io.IOException;

/**
 * @author NaveenWodeyar
 * @date 07-May-2025 9:02:19 pm
 */

public class SuppressWarningsEx {

    public static void main(String[] args) {
        sneakyThrow(new IOException("This is sneaky"));
    }

    @SuppressWarnings("unchecked")
    static <T extends Throwable> void sneakyThrow(Throwable t) throws T {
        throw (T) t;
    }
}
