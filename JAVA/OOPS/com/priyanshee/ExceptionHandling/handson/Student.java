package com.priyanshee.ExceptionHandling.handson;

public class Student {
    private final String name;
    private final int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
