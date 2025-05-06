package com.priyanshee.Multithreading.BankAccountSynchronization;

public class BankAccount {
  private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    balance = balance + amount;
    System.out.println(Thread.currentThread().getName() + " deposited: " + amount);
  }

  public void withdraw(double amount) {
    if(amount <= balance) {
      balance = balance - amount;
      System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
    } else {
      System.out.println("Insufficient balance.");
      System.out.println(Thread.currentThread().getName() + " tried to withdrew: " + amount);

    }
  }

  public double getBalance() {
    return balance;
  }
}
