package com.priyanshee.FunctionalProgramming.Level5.question46;

public class Employee {
    private String name;
    private int joiningYear;
    private double salary;

    public Employee(String name, int joiningYear, double salary) {
        this.name = name;
        this.joiningYear = joiningYear;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    public double getSalary() {
        return salary;
    }
}
