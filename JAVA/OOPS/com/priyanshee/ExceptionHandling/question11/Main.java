package com.priyanshee.ExceptionHandling.question11;

public class Main {
    public static void main(String[] args) {
        ChildThread task = new ChildThread();
        Thread th1 = new Thread(task);
        th1.setUncaughtExceptionHandler(new ThreadExceptionHandler());
        try {
            th1.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread is also running.");
    }
}
