package com.priyanshee.Multithreading.OddEvenPrinter;

public class OddPrinter extends Thread {
    private final Printer printer;
    public OddPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        try {
            printer.printOdd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
