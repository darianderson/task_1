package com.tsyhanok;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(1L, "Isaac", "Asimov", -25, 155);

        List<Employee> employees = new LinkedList<Employee>();
        employees.add(new Programmer(1L, "Isaac", "Asimov", 1500, 155));
        employees.add(new Programmer(2L, "Stanislaw", "Lem", 2300, 178));
        employees.add(new Programmer(3L, "Isaac", "Newton", 2000, 147));
        employees.add(new Manager(4L, "Laura", "Plato", 1750, 161));

        System.out.println("Percentage for Worked Hours: " +  employees.get(0).getPercentageForWorkedHours());

        Accountant accountant = new Accountant();
        Map<String, Integer> map = accountant.getSalaryForEmployees(employees);
        map.entrySet().forEach(employee ->{
            System.out.println(employee.getKey() + " : " + employee.getValue());
        });
    }
}
