package com.priyanshee.dayone.question5;

public class FreeLancer extends Employee {
    long hours;
    long payPerHour;

    public FreeLancer(String name, int id, long hours, long payPerHour) {
        super(name, id, "Freelancer", hours * payPerHour);
        this.hours = hours;
        this.payPerHour = payPerHour;
    }

    @Override
    public String getDetails() {
        return "ID: " + id + "\nName: " + name + "\nRole: " + role + "\nBilled: " + salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Hourly income: " +  payPerHour);
        System.out.println("Hours worked: " +  hours);
        System.out.println("Total Billed: " + payPerHour * hours);
    }
}
