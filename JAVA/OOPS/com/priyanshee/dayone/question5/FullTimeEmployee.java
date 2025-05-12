package com.priyanshee.dayone.question5;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int id, long salary) {
        super(name, id, "Full Time Employee", salary);
    }

    @Override
    public String getDetails() {
        return "ID: " + id + "\nName: " + name + "\nRole: " + role + "\nBilled: " + salary;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Monthly salary is: " + salary / 12);
    }
}
