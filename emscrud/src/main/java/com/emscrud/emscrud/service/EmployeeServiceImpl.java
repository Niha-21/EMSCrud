package com.emscrud.emscrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.emscrud.emscrud.Employee;
import com.emscrud.emscrud.entity.EmployeeEntity;
import com.emscrud.emscrud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    List<Employee> employees = new ArrayList<>();

    @Override
    public String createEmployee(Employee emp) {
        // TODO Auto-generated method stub

        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(emp, employeeEntity);
        employeeRepository.save(employeeEntity);
        
        return "Saved Successfully!";
    }

    @Override
    public List<Employee> getEmployees() {
        // TODO Auto-generated method stub

        List<EmployeeEntity> employeeEntityList = new ArrayList<>();
        employeeEntityList = employeeRepository.findAll();

        List<Employee> employees = new ArrayList<>();

        for (EmployeeEntity employeeEntity : employeeEntityList) {
            Employee employee = new Employee(); 
            BeanUtils.copyProperties(employeeEntity, employee);
            employees.add(employee);
        }

        return employees;
    }

    @Override
    public String deleteEmployee(Long id) {
        // TODO Auto-generated method stub

        employeeRepository.deleteById(id);

        return "Deleted Successfully!";
    }

}
