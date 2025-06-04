package com.priyanshee.Collections.question3;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        Map<String, List<Employee>> department = new HashMap<>();

        department.put("IT", List.of(new Employee("Alice", 95000), new Employee("Bob", 87000)));
        department.put("HR", List.of(new Employee("Charlie", 65000), new Employee("David", 72000)));

        department.entrySet().stream().forEach(
                dep -> {
                    System.out.println("\nDepartment: " + dep.getKey());
                    dep.getValue().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
                }
        );

        System.out.println("-----------");

        //top paid employees
        System.out.println("Top n paid Employees across department: ");
        department.values().stream().flatMap(List::stream).sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(n).forEach(System.out::println);

    }
}
