package com.priyanshee.dayone.BankAccount;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount =  new SavingAccount("Priyanshee Sisodiya", "1234", 37824, 5);
        savingAccount.displayAccountType();
        System.out.println("The account number is: " + savingAccount.getAccountNumber());
        System.out.println("The account hodlers name is: " + savingAccount.getAccountHolderName());
        System.out.println("Current Balance: " + savingAccount.getBalance());
        System.out.println("Withdraw momney 1000 Rs.");
        savingAccount.withdraw(1000);
        System.out.println("Current Balance: " + savingAccount.getBalance());
        System.out.println("Deposit money 4000 Rs.");
        savingAccount.deposit(4000);
        System.out.println("Current Balance: " + savingAccount.getBalance());

        System.out.println("-----------------------");

        CurrentAccount currentAccount = new CurrentAccount("Rishi", "34224", 23480, 1000);
        currentAccount.displayAccountType();
        System.out.println("The account number is: " + savingAccount.getAccountNumber());
        System.out.println("The account hodlers name is: " + savingAccount.getAccountHolderName());
        System.out.println("Current Balance: " + savingAccount.getBalance());
        currentAccount.getTransactionLimit();
        currentAccount.deposit(5000);
        currentAccount.withdraw(1000);
        System.out.println("Current Balance: " + savingAccount.getBalance());
    }
}
