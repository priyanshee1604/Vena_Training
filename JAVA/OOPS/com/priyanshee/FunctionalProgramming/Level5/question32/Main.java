package com.priyanshee.FunctionalProgramming.Level5.question32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>(List.of(
                new Student("Alice", 85),
                new Student("Bob", 78),
                new Student("Charlie", 92),
                new Student("Diana", 81),
                new Student("Evan", 67)
        ));

        student.stream().filter(stu -> stu.getGrade() > 80).sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
    }
}
