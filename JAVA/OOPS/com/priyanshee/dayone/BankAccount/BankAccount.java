package com.priyanshee.dayone.BankAccount;

abstract class BankAccount implements Transactions{
    //made them private thus Encapsulation and made getters and setter for them if required.
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid amout");
            return;
        }
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("SavingsAccount: Deposited $" + amount + " | New Balance: $" + getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("SavingsAccount: Withdrew $" + amount + " | New Balance: $" + getBalance());
        } else {
            System.out.println("Invalid withdrawal or insufficient balance.");
        }
    }

    //abstract method for polymorphism for overriding in base class
    public abstract void displayAccountType();
}
