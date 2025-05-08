package com.priyanshee.Multithreading.BankAccountSync;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount sharedAccount = new BankAccount(100);

        Thread t1 = new Thread(new BankUser(sharedAccount), "User-1");
        Thread t2 = new Thread(new BankUser(sharedAccount), "User-2");
        Thread t3 = new Thread(new BankUser(sharedAccount), "User-3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("\nFinal Balance: " + sharedAccount.getBalance());
        System.out.println("\nTransaction Log:");
        sharedAccount.printTransactionLog();
    }
}
