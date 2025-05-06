package com.priyanshee.Multithreading.OddEvenPrinter;

public class OddEvenPrinter {
  public static void main(String[] args) {

    Printer printer = new Printer();
    OddPrinter odd = new OddPrinter(printer);
    EvenPrinter even = new EvenPrinter(printer);

    odd.start();
    even.start();
  }
}
