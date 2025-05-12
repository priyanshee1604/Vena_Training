package com.priyanshee.ExceptionHandling.question12;

public class GlobalExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Global Handler: Uncaught exception in thread: " + t.getName());
        System.out.println("Exception Message: " + e.getMessage() + " in " + t.getName());
    }
}
