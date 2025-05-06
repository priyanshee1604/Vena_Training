package com.priyanshee.Multithreading.OddEvenPrinter;

public class EvenPrinter extends Thread {
    private final Printer printer;
    public EvenPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        try {
            printer.printEven();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
