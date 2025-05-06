package com.priyanshee.Multithreading.BankAccountSynchronization;

public class Main {
  public static void main(String[] args) {
    BankAccount shareAcoount = new BankAccount(100);

    Thread user1 = new Thread(new BankUser(shareAcoount));
    Thread user2 = new Thread(new BankUser(shareAcoount));
    Thread user3 = new Thread(new BankUser(shareAcoount));

    user1.start();
    user2.start();
    user3.start();

    System.out.println("Final balance: " + shareAcoount.getBalance());
  }
}
