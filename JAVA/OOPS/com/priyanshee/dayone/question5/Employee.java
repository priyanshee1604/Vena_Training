package com.priyanshee.dayone.question5;

abstract public class Employee {
    //abstract class can have variables like normal variables in a class.
    protected String name;
    protected int id;
    protected String role;
    protected long salary;

    public Employee(String name, int id, String role, long salary) {
        this.name = name;
        this.id = id;
        this.role = role;
        this.salary = salary;
    }
    //abstract classes can have both concrete and non-concrete methods
    //the abstract methods need to be overridden and defined in child class
    //these abstract methods cannot be static, final or private as then need to override.
    public abstract void getDetails();
    public abstract void calculateSalary();
}
