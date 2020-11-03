package com.tsyhanok;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccountant {

    List<Employee> employees;

    Accountant accountant;

    {
        accountant = new Accountant();
        employees = new ArrayList<>();
        employees.add(new Programmer(1L, "Isaac", "Asimov", 1500, 155));
        employees.add(new Programmer(2L, "Stanislaw", "Lem", 1500, 170));
        employees.add(new Manager(3L, "John", "Golt", 1500, 0));
    }

    @Test
    public void testGetSalaryForEmployeesSuccessOne() {
        assertEquals(1440, accountant.getSalaryForEmployees(employees).get("Asimov"));
    }

    @Test
    public void testGetSalaryForEmployeesSuccessTwo() {
        assertEquals(0, accountant.getSalaryForEmployees(employees).get("Golt"));
    }

}
