package com.priyanshee.dayone.question3;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Priyanshee Sisodiya", 70000, 343429454);
        account1.getAccountHoldersDetail();
        account1.setBalance(123456);
        account1.setBalance(-234343);
    }
}
