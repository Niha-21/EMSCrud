package com.emscrud.emscrud.service;

import java.util.List;

import com.emscrud.emscrud.Employee;

public interface EmployeeService {
    
    public String createEmployee(Employee emp); 

    public List<Employee> getEmployees();
    
    public Employee getEmployeeById(Long id);

    public String deleteEmployee(Long id);

    public String updateEmployee(Long id, Employee emp);

}
