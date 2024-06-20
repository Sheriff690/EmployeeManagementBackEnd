package com.Employeemanagement.Employee.management.Service;

import com.Employeemanagement.Employee.management.Model.Employee;
import com.Employeemanagement.Employee.management.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeServiceInterface{
    @Autowired   //Dependency injection
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        Employee employeeToUpdate = employeeRepository.findById(id).orElseThrow();
        employeeToUpdate.setFirstname(employee.getFirstname());
        employeeToUpdate.setLastname(employee.getLastname());
        employeeToUpdate.setEmail(employee.getEmail());
        return employeeRepository.save(employeeToUpdate);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }


}
