package com.priyanshee.ExceptionHandling.question11;

public class ChildThread implements Runnable {

    //the run method cannot throw checked exception, but can throw unchecked exceptions
    @Override
    public void run() {
        System.out.println("Child thread started.");
        throw new RuntimeException("Exception from the child thread.");
    }
}


//If your task might throw a checked exception → handle it inside run() using try-catch.
//Or use a Callable if you want the ability to propagate exceptions.
