package com.priyanshee.dayone.question3;

public class BankAccount {
    private final String accountHolder;
    private double balance;
    private final long accountNumber;

    public BankAccount(String accountHolder, int balance, int accountNumber) {
        System.out.println("Setting up the Account for you :)");
        this.accountHolder = accountHolder;
        setBalance(balance);
        //using the method as we need to apply the check for negative case.
        this.accountNumber = accountNumber;
    }

    public String getAccountHoldersDetail() {
        return "Name: " + accountHolder + "\nBalance: " + balance + "\nAccount Number: " + accountNumber;
    }

    public void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Negative Balance not accepted :(");
        }

    }
}
