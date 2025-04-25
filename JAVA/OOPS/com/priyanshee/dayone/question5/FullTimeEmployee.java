package com.priyanshee.dayone.question5;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int id, long salary) {
        super(name, id, "Full Time Employee", salary);
    }

    public void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + salary);
    }

    public void calculateSalary() {
        System.out.println("Monthly salary is: " + salary / 12);
    }
}
