package com.priyanshee.dayone.BankAccount;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountHolderName, String accountNumber, double balance, double intesetRate) {
        super(accountHolderName, accountNumber, balance);
    }

    //overriding the method
    public void displayAccountType() {
        System.out.println("This is a Saving Account.");
    }
}
