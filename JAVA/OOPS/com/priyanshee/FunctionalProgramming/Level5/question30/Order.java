package com.priyanshee.FunctionalProgramming.Level5.question30;

public class Order {
    private int id;
    private String customerName;
    private double amount;
    private String status; // e.g., "PENDING", "COMPLETED", "CANCELLED"

    public Order(int id, String customerName, double amount, String status) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return id + " - " + customerName + " - $" + amount + " - " + status;
    }
}
