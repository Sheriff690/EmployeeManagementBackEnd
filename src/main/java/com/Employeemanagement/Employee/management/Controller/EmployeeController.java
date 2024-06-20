package com.Employeemanagement.Employee.management.Controller;

import com.Employeemanagement.Employee.management.Model.Employee;
import com.Employeemanagement.Employee.management.Service.EmployeeServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeServiceInterface employeeService;  /**we're bringing in the coecodeEmployeeService interface*/

    /** This is a post request, we're saving the employee to the database*/
    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }
    /** A get request, it returns all the employees from the database*/
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    /** Another get request, we're optionally asking for a single employee if exist*/
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    /**Here we're updating the data of an employee, a put request*/
    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        return employeeService.updateEmployee(id, employee);
    }
    /**Here we're deleting the employee entity*/
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
