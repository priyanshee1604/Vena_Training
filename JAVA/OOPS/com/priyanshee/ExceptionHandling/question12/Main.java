package com.priyanshee.ExceptionHandling.question12;

public class Main {
    public static void main(String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(new GlobalExceptionHandler());
        Thread thread1 = new Thread(new Task(), "Worker-1");
        thread1.start();

        Thread thread2 = new Thread(new Task(), "Worker-2");
        thread2.start();

        System.out.println("Main thread is running.");
    }
}
