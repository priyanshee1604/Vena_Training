package com.priyanshee.dayone.BankAccount;

public class CurrentAccount extends BankAccount {
    private double transactionLimit;

    public CurrentAccount(String accountHolderName, String accountNumber, double initialBalance, double transactionLimit) {
        super(accountHolderName, accountNumber, initialBalance);
        this.transactionLimit = transactionLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is Current Account.");
    }

    public void getTransactionLimit() {
        System.out.println("The transaction limit for this account is: " + transactionLimit);
    }
    public void withdraw(double amount) {
        if(amount > 0 && amount <= getBalance() && amount <= transactionLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid Transaction.");
        }
    }
}
