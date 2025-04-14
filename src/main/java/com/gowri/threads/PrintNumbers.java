package com.gowri.threads;

/**
 * @author NaveenWodeyar
 * @date 14-Apr-2025 10:17:11 pm
 */

public class PrintNumbers extends Thread {

    private long startTime;
    private long endTime;

    @Override
    public void run() {
        startTime = System.nanoTime();  // Start time for the thread
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(1000); // Simulate some task
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        endTime = System.nanoTime(); // End time for the thread
    }

    public long getTimeTaken() {
        return endTime - startTime; // Time taken by the thread
    }
}
