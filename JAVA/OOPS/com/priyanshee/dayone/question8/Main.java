package com.priyanshee.dayone.question8;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Priyanshee Sisodiya", 100000, BankAccount.AccountType.SAVINGS);
        account1.displayDetails();
        System.out.println("-------------");
        account1.withdraw(20000);
        account1.deposit(10000);
        account1.withdraw(20000000);
        System.out.println("-------------");
        System.out.println("-------------");
        BankAccount account2 = new BankAccount("LakshyaRaj", 1000000, BankAccount.AccountType.CURRENT);
        account2.displayDetails();
        System.out.println("-------------");
        account2.withdraw(30000);
        account2.deposit(4000);
        account2.withdraw(200000000);
        System.out.println("-------------");
    }
}
