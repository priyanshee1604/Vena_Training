package com.priyanshee.Collections.question10;

import java.time.LocalDateTime;

public class Transaction {
    private final double amount;
    private final String type;
    private final LocalDateTime timestamp;

    public Transaction(double amount, String type, LocalDateTime timestamp) {
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
