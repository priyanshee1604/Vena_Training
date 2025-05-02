package com.priyanshee.Collections.question8;

import java.util.Objects;

public class Employee {
    private int level;
    private String name;
    private String role;
    private String department;

    public Employee(int level, String name, String role, String department) {
        this.level = level;
        this.name = name;
        this.role = role;
        this.department = department;
    }

    public int getLevel() {
        return level;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return level + " " + name + " " + role;
    }
}
