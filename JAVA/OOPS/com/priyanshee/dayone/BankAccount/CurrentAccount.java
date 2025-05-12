package com.priyanshee.dayone.BankAccount;

public class CurrentAccount extends BankAccount {
    private final double transactionLimit; //can make it final.

    public CurrentAccount( String accountNumber, double initialBalance, double transactionLimit) {
        super(accountNumber, initialBalance);
        this.transactionLimit = transactionLimit;
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance() && amount <= getTransactionLimit()) {
            setBalance(getBalance() - amount);
            System.out.println("SavingsAccount: Withdrew $" + amount + " | New Balance: $" + getBalance());
        } else {
            System.out.println("Invalid withdrawal or insufficient balance or Not in transaction limit.");
        }
    }
}
