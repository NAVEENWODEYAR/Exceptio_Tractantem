package com.gowri.threads;

import java.util.concurrent.*;

/**
 * @author NaveenWodeyar
 * @date 02-May-2025 12:06:11 am
 */

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Callable<Integer> task = () -> 123;
        Future<Integer> future = executor.submit(task);

        System.out.println("Result: " + future.get());
        executor.shutdown();
    }
}
