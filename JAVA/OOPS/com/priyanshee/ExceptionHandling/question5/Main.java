package com.priyanshee.ExceptionHandling.question5;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Priyanshee", 5000.0);
        BankAccount acc2 = null; // Simulate invalid target

        BankService bankService = new BankService();
        bankService.transferFunds(acc1, acc2, 1000.0);

        System.out.println("Final Balance of " + acc1.getName() + ": ₹" + acc1.getBalance());
    }
}
