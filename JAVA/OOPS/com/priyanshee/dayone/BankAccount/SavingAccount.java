package com.priyanshee.dayone.BankAccount;

public class SavingAccount extends BankAccount {

    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    //depicts run time polymorphism as method is override in the base class.
    @Override
    public void displayAccountType() {
        System.out.println("This is a Saving Account.");
    }
}
