package com.priyanshee.Multithreading.BankAccountSync;

public class BankUser implements Runnable {
    private final BankAccount account;

    public BankUser(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(100);
        account.withdraw(50);
        account.withdraw(70);
    }
}

