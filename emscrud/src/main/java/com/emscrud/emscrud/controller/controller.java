package com.emscrud.emscrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emscrud.emscrud.Employee;

@RestController
public class controller {
    
    @RequestMapping("controller")
    public static String myMethod() {
        return "Hey! welcome to controller!";
    }

    @GetMapping("getEmployees")
    public List<Employee> getEmployees() {
        List<Employee> empList = new ArrayList<>(); 
        empList.add(new Employee("1001VU5", "Niha", "niha.shaikh@oracle.com", "City Park"));
        return empList;
    }

}
