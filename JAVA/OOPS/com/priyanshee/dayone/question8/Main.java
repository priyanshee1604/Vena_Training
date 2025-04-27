package com.priyanshee.dayone.question8;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Priyanshee Sisodiya", 100000, "Savings");
        account1.displayDetails();
        System.out.println("-------------");
        account1.withdraw(2543);
        account1.deposit(234543);
        account1.withdraw(2345435);
        System.out.println("-------------");
        account1.displayDetails();
    }
}
