package com.priyanshee.ExceptionHandling.question12;


public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Task started in thread: " + Thread.currentThread().getName());
        throw new RuntimeException("Unchecked exception in Task.");
    }
}

