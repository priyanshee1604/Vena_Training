package com.priyanshee.FunctionalProgramming.Level5.question46;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 2020, 55000),
                new Employee("Bob", 2021, 60000),
                new Employee("Charlie", 2020, 70000),
                new Employee("David", 2021, 65000),
                new Employee("Eve", 2022, 62000)
        );

        // Group by year and find max salary in each group
        employees.stream().collect(Collectors.groupingBy(Employee::getJoiningYear, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)))).forEach(
                (year, emp) -> {
                    System.out.println(year + " " + emp.get().getSalary() + " " + emp.get().getName());
                }
        );
    }
}
