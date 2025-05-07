package com.priyanshee.FunctionalProgramming.Level5.question31;

public class Transaction {
    private double amount;
    private String type; // "DEBIT" or "CREDIT"

    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
