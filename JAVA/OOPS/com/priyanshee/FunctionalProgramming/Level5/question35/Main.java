package com.priyanshee.FunctionalProgramming.Level5.question35;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 60000),
                new Employee("Charlie", "HR", 55000),
                new Employee("Diana", "Finance", 70000),
                new Employee("Evan", "IT", 65000),
                new Employee("Fiona", "IT", 62000)
        ));

        Map<String, Double> averageSalaries = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        averageSalaries.forEach((s, aDouble) -> System.out.println(s + " " + aDouble));
    }
}
