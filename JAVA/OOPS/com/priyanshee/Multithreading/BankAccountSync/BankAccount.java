package com.priyanshee.Multithreading.BankAccountSync;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final List<String> transactionLog = new ArrayList<>();
    private final ReentrantLock lock = new ReentrantLock(); // Per-account lock

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            transactionLog.add(Thread.currentThread().getName() + " deposited: " + amount);
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();
        try {
            if (amount <= balance) {
                balance -= amount;
                transactionLog.add(Thread.currentThread().getName() + " withdrew: " + amount);
            } else {
                transactionLog.add(Thread.currentThread().getName() + " tried to withdraw " + amount + " - Insufficient funds");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }

    public void printTransactionLog() {
        lock.lock();
        try {
            for (String entry : transactionLog) {
                System.out.println(entry);
            }
        } finally {
            lock.unlock();
        }
    }
}

