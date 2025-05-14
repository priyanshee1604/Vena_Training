package com.priyanshee.Collections.handson.model;

import java.util.Objects;

public class Student {
    private final String id;
    private final String name;
    private final String email;
    private final String year;
    private final String branch;

    public Student(String id, String name, String email, String year, String branch) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.year = year;
        this.branch = branch;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getYear() { return year; }
    public String getBranch() { return branch; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id.equals(s.id);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}
