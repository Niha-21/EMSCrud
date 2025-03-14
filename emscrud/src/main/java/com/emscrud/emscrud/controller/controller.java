package com.emscrud.emscrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emscrud.emscrud.Employee;
import com.emscrud.emscrud.service.EmployeeService;

@RestController
public class controller {
    
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("controller")
    public static String myMethod() {
        return "Hey! welcome to Employee Management System!";
    }

    @GetMapping("getEmployees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }    

    @PostMapping("createEmployee")
    public String createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }

}
