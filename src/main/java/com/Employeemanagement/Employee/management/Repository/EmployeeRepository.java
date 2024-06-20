package com.Employeemanagement.Employee.management.Repository;

import com.Employeemanagement.Employee.management.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
