package com.priyanshee.FunctionalProgramming.Level5.question50;

import java.time.LocalDate;

class Order {
    private double amount;
    private LocalDate date;

    public Order(double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "amount=" + amount +
                ", date=" + date +
                '}';
    }
}

