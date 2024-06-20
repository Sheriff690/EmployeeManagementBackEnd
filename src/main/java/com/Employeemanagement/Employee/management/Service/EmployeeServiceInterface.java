package com.Employeemanagement.Employee.management.Service;

import com.Employeemanagement.Employee.management.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    public Employee saveEmployee(Employee employee);
    public Optional<Employee> getEmployeeById(int id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);
}
