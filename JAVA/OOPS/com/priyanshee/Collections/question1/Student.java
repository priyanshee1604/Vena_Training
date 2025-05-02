package com.priyanshee.Collections.question1;

class Student {
    private int id;
    private String name;
    private int age;
    private double grade;
    private String branch;

    public Student(int id, String name, int age, double grade, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    //need to override this method here as when I'll print it in the stream in forEach loop
    //the thing that gets executed is System.out.println(student.toString());
    // to print the proper formate I need ot overrider the current toString method.
    //else it would have been printed something like className@objectHexcode
    public String toString() {
        return "{id: " + id + ", name: " + name + ", age: " + age + ", branch: " + branch + ", grade: " + grade + "}";
    }
}