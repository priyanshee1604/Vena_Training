package com.priyanshee.Multithreading.BankAccountSynchronization;

public class BankUser implements Runnable {
  private final BankAccount account;

  public BankUser(BankAccount account) {
    this.account = account;
  }

  public void run() {
    synchronized (account) {
      account.deposit(100);
      account.withdraw(30);
      account.withdraw(20);
      System.out.println(account.getBalance());
      account.withdraw(80);
      System.out.println("--------------------");
    }
  }
}
