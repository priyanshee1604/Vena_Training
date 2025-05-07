package com.priyanshee.FunctionalProgramming.Level5.question34;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "HR"),
                new Employee("Diana", "Finance"),
                new Employee("Evan", "IT"),
                new Employee("Fiona", "IT")
        ));

        employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)).forEach((s, employees1) -> System.out.println(s + " " + employees1.size()));
    }
}

