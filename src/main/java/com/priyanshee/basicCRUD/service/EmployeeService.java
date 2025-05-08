package com.priyanshee.basicCRUD.service;

import com.priyanshee.basicCRUD.model.Employee;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class EmployeeService {

    private Map<Integer, Employee> employeeData = new HashMap<>();
    private int currentId = 1;

    // Create a new Employee
    public Employee createEmployee(String name, String email) {
        Employee newEmployee = new Employee(currentId++, name, email);
        employeeData.put(newEmployee.getId(), newEmployee);
        return newEmployee;
    }

    // Fetch all Employees
    public Map<Integer, Employee> getAllEmployees() {
        return employeeData;
    }

    // Fetch an Employee by ID
    public Employee getEmployeeById(int id) {
        return Optional.ofNullable(employeeData.get(id))
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    // Update an Employee by ID
    public Employee updateEmployee(int id, String name, String email) {
        Employee employee = getEmployeeById(id);  // This will throw an exception if not found
        employee.setName(name);
        employee.setEmail(email);
        return employee;
    }

    // Delete an Employee by ID
    public void deleteEmployee(int id) {
        if (!employeeData.containsKey(id)) {
            throw new RuntimeException("Employee not found");
        }
        employeeData.remove(id);
    }
}

