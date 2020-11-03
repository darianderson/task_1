package com.tsyhanok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProgrammer {

    @Test
    public void testGetSalarySuccessOne() {
        assertEquals(1440,
                new Programmer(1L, "Isaac", "Asimov", 1500, 155).getSalary());
    }

    @Test
    public void testGetSalarySuccessTwo() {
        assertEquals(1590,
                new Programmer(2L, "Stanislaw", "Lem", 1500, 170).getSalary());
    }

    @Test
    public void testGetSalarySuccessThree() {
        assertEquals(0,
                new Programmer(3L, "John", "Golt", 1500, 0).getSalary());
    }

    @Test
    public void testGetPercentageForWorkedHoursSuccess() {
        assertEquals(91,
                new Programmer(4L, "Isaac", "Newton", 2000, 147)
                        .getPercentageForWorkedHours());
    }

}
