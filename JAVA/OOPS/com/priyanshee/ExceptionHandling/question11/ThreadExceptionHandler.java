package com.priyanshee.ExceptionHandling.question11;

public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Exception caught from thread: " + t.getName());
        System.out.println("Exception message: " + e.getMessage());
    }
}
