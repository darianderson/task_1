package com.tsyhanok;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Accountant {

    public Map<String, Integer> getSalaryForEmployees(List<Employee> employees){
        Map<String, Integer> employeesSalary = new HashMap<>();
        for(Employee employee: employees){
            employeesSalary.put(employee.getLastName(), employee.getSalary());
        }
        return employeesSalary;
    }
}
