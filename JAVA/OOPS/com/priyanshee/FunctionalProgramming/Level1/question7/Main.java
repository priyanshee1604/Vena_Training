package com.priyanshee.FunctionalProgramming.Level1.question7;

//7.	Create a Runnable lambda that prints “Hello Functional Java”.
public class Main {
    public static void main(String[] args) {
        Runnable toprint = () -> System.out.println("Hello Functional Java");

        toprint.run();

        Thread t1 = new Thread(toprint);
        t1.start();
    }
}
