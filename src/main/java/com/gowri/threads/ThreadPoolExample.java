package com.gowri.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author NaveenWodeyar
 * @date 02-May-2025 12:05:45 am
 */

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
        };

        for (int i = 0; i < 5; i++) {
            executor.submit(task);
        }

        executor.shutdown();
    }
}
