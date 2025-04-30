package com.gowri.threads;

/**
 * @author NaveenWodeyar
 * @date 30-Apr-2025 10:21:02 pm
 */

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread by extending Thread class");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread by implementing Runnable");
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
    }
}

