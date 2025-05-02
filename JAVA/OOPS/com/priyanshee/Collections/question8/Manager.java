package com.priyanshee.Collections.question8;

public class Manager {
    private String name;
    private String department;

    public Manager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " " + department;
    }
}
