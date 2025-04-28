package com.priyanshee.dayone.BankAccount;

abstract class BankAccount {
    //made them private thus Encapsulation
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrew: " + amount + " New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //abstract method for polymorphism
    public abstract void displayAccountType();
}
