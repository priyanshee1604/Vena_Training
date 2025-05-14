package com.priyanshee.Collections.question8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Manager, TreeMap<Integer, List<Employee>>> hierarchy = new HashMap<>();
        Manager manager1 = new Manager("Rajesh", "Engineering");
        Manager manager2 = new Manager("Mayank", "Tools");
        Manager manager3 = new Manager("Vaishali", "People and Talent");
        Manager manager4 = new Manager("Sankalp", "Employer Branding");

        Employee emp1 = new Employee(0, "Priyanshee", "Intern", "Engineering");
        Employee emp2 = new Employee(0, "Priyansh", "Intern", "Engineering");
        Employee emp3 = new Employee(1, "Priya", "SDE", "Engineering");

        Employee emp4 = new Employee(1, "Ansh", "SDE", "Tools");
        Employee emp11 = new Employee(1, "Kritika", "SDE", "Tools");
        Employee emp5 = new Employee(0, "Shee", "Intern", "Tools");
        Employee emp6 = new Employee(0, "Shree", "Intern", "Tools");

        Employee emp7 = new Employee(1, "Rriyanshee", "HR", "People and Talent");
        Employee emp8 = new Employee(1, "Kriyanshee", "HR", "People and Talent");
        Employee emp9 = new Employee(0, "Rriyansh", "Intern", "People and Talent");
        Employee emp10 = new Employee(0, "Kriyansh", "Intern", "People and Talent");

        Employee emp12 = new Employee(1, "Parnika", "MA", "Employer Branding");
        Employee emp13 = new Employee(0, "Shriya", "Intern", "Employer Branding");
        Employee emp14 = new Employee(0, "Harshita", "Intern", "Employer Branding");
        Employee emp15 = new Employee(1, "Annu", "MA", "Employer Branding");

        hierarchy.putIfAbsent(manager1, new TreeMap<>());
        hierarchy.get(manager1).putIfAbsent(0, List.of(emp1, emp2));
        hierarchy.get(manager1).putIfAbsent(1, List.of(emp3));

        hierarchy.putIfAbsent(manager2, new TreeMap<>());
        hierarchy.get(manager2).putIfAbsent(0, List.of(emp5, emp6));
        hierarchy.get(manager2).putIfAbsent(1, List.of(emp4, emp11));

        hierarchy.putIfAbsent(manager3, new TreeMap<>());
        hierarchy.get(manager3).putIfAbsent(0, List.of(emp9, emp10));
        hierarchy.get(manager3).putIfAbsent(1, List.of(emp7, emp8));

        hierarchy.putIfAbsent(manager4, new TreeMap<>());
        hierarchy.get(manager4).putIfAbsent(0, List.of(emp13, emp14));
        hierarchy.get(manager4).putIfAbsent(1, List.of(emp12, emp15));

        hierarchy.entrySet().stream().forEach( entry ->{
            Manager man = entry.getKey();
            System.out.println(man);
            TreeMap<Integer, List<Employee>> value = entry.getValue();
            value.entrySet().stream().forEach(manHier -> {
                Integer level = manHier.getKey();
                System.out.println("level: " + level);
                System.out.println("employee list:  " + manHier.getValue());
            });
        });
    }
}