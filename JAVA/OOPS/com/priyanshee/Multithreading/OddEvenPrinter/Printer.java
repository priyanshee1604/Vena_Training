package com.priyanshee.Multithreading.OddEvenPrinter;

public class Printer {
  private  int number = 1;
  private final int max = 100;

  public synchronized void printOdd() throws InterruptedException {
    while(number < max) {
      while (number % 2 == 0) wait();

      System.out.println(number + " ");
      number++;
      notify();
    }
  }

  public synchronized void printEven() throws InterruptedException {
    while (number < max){
      while (number % 2 == 1) wait();

      System.out.println(number + " ");
      number++;
      notify();
    }
  }

}
