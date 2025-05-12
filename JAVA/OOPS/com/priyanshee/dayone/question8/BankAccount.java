package com.priyanshee.dayone.question8;

public class BankAccount {
    enum AccountType {
        SAVINGS,
        CURRENT
    }

    private final String name;
    private double balance;
    private final AccountType type;

    public BankAccount(String name, double balance, AccountType type) {
        this.name = name;
        this.balance = balance;
        this.type = type;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //TODO: user loggers
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew: " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public  void displayDetails() {
        System.out.println("Account Holder: " + this.name);
        System.out.println("Account Type: " + this.type);
        System.out.println("Balance: $" + this.balance);
    }
}
