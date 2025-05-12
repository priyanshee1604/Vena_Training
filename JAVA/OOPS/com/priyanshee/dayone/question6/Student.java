package com.priyanshee.dayone.question6;

public class Student {
    private static int totalStudents = 0;
    private final int id;
    private final String name;

    public  Student(String name, int id) {
        this.name = name;
        this.id = id;
        totalStudents++;
    }

    public void totalCountDisplay() {
        System.out.println("The total number of students / objects are " + totalStudents);
    }

    public void studentDetail() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
