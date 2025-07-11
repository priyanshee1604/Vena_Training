package com.priyanshee.Collections.question1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students =  new ArrayList<>(15);

        //Storing 15 students in array list.
        students.add(new Student(1, "Alice", 20, 8.5, "CSE"));
        students.add(new Student(2, "Bob", 21, 7.2, "ECE"));
        students.add(new Student(3, "Charlie", 22, 9.1, "CSE"));
        students.add(new Student(4, "David", 20, 6.9, "ME"));
        students.add(new Student(5, "Eva", 21, 8.0, "ECE"));
        students.add(new Student(6, "Frank", 23, 7.8, "CSE"));
        students.add(new Student(7, "Grace", 19, 9.3, "ME"));
        students.add(new Student(8, "Hannah", 22, 6.5, "CSE"));
        students.add(new Student(9, "Ivy", 21, 8.4, "EEE"));
        students.add(new Student(10, "Jack", 20, 7.5, "EEE"));
        students.add(new Student(11, "Kate", 22, 9.7, "CSE"));
        students.add(new Student(12, "Leo", 23, 6.8, "ME"));
        students.add(new Student(13, "Mia", 20, 7.9, "ECE"));
        students.add(new Student(14, "Nina", 21, 8.2, "EEE"));
        students.add(new Student(15, "Oscar", 22, 7.0, "ME"));

        //sort by branch and grades
        //here I am able to call comparing method on Comparator interface as the method define is static,
        //thus just like normal static methods that belongs to class this static method belong to interface.
        //thus can call directly
        students.stream().sorted(Comparator.comparing(Student::getBranch).thenComparing(Comparator.comparing(Student::getGrade).reversed())).forEach(System.out::println);
        System.out.println("--------------------------");


        //group students by branch
        Map<String, List<Student>> studentsByBranch = students.stream().collect(Collectors.groupingBy(Student::getBranch));
        studentsByBranch.forEach((branch, student) -> {
            System.out.println("\nBranch: " + branch);
            student.forEach(System.out::println);
        });
    }
}
