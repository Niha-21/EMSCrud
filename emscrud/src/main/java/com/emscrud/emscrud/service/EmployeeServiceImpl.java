package com.emscrud.emscrud.service;

import java.util.ArrayList;
import java.util.List;

import com.emscrud.emscrud.Employee;

public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee emp) {
        // TODO Auto-generated method stub
        employees.add(emp);
        return "Saved Successfully!";
    }

    @Override
    public List<Employee> getEmployees() {
        // TODO Auto-generated method stub
        return employees;
    }

    @Override
    public String deleteEmployee(int id) {
        // TODO Auto-generated method stub
        employees.remove(id);
        return "Deleted Successfully!";
    }

}
