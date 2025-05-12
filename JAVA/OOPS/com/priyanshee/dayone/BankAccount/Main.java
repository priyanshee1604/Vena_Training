package com.priyanshee.dayone.BankAccount;

public class Main {
    public static void main(String[] args) {
        //make parents reference and store child's obj in it to properly see overriding.
        BankAccount savingAccount =  new SavingAccount("1234", 10000);

        savingAccount.displayAccountType();
        System.out.println("The account number is: " + savingAccount.getAccountNumber());
        System.out.println("Current Balance: " + savingAccount.getBalance());
        System.out.println("Withdraw money 1000 Rs.");
        savingAccount.withdraw(1000);
        System.out.println("Current Balance: " + savingAccount.getBalance());
        System.out.println("Deposit money 4000 Rs.");
        savingAccount.deposit(4000);
        System.out.println("Current Balance: " + savingAccount.getBalance());

        System.out.println("-----------------------");

        //cannot make reference of the parent as BankAccount class do not have getTransactionLimit method
        //it is only in the CurrentAccount and during compilation it is checked with the reference of the
        //created and not with the object thus throws a compile time error cannot find symbol.
        CurrentAccount currentAccount = new CurrentAccount("34224", 20000, 1000);
        currentAccount.displayAccountType();
        System.out.println("The account number is: " + currentAccount.getAccountNumber());
        System.out.println("Current Balance: " + currentAccount.getBalance());
        System.out.println("Transaction limit of the account is: " + currentAccount.getTransactionLimit());
        currentAccount.deposit(5000);
        currentAccount.withdraw(1000);
        System.out.println("Current Balance: " + currentAccount.getBalance());
    }
}
