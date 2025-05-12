package com.priyanshee.ExceptionHandling.question5;

public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        if (balance < amount) {
            throw new Exception("Insufficient funds in account: " + accountName);
        }
        this.balance -= amount;
    }

    public String getName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }
}

