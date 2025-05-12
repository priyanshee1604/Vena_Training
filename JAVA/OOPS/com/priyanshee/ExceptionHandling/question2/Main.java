package com.priyanshee.ExceptionHandling.question2;

public class Main {
    public static void main(String[] args) {
        BankService acc1 = new BankService("Priyanshee", 5000.0);
        BankService acc2 = new BankService("Lakshya", 3000.0);

        try {
            acc1.transferFunds(acc2, acc1, 3500.0);
        } catch (BankingException e) {
            System.err.println("Error caught: " + e.getMessage());
        }

    }
}
