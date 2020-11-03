package com.tsyhanok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestManager {

    @Test
    public void testGetSalarySuccessOne() {
        assertEquals(1440,
                new Manager(1L, "Isaac", "Asimov", 1500, 155).getSalary());
    }

    @Test
    public void testGetSalarySuccessTwo() {
        assertEquals(2300,
                new Manager(2L, "Stanislaw", "Lem", 2300, 178).getSalary());
    }

}
