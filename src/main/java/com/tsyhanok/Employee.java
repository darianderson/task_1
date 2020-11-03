package com.tsyhanok;

import java.util.Objects;

abstract public class Employee {

    protected static final int MONTHLY_WORKED_HOURS = 160;
    protected static final int HUNDRED_PERCENT = 100;

    private Long id;
    private String firstName;
    private String lastName;
    private int rate;
    private int workedHours;

    public Employee(Long id, String firstName, String lastName, int rate, int workedHours) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rate = rate;
        this.workedHours = workedHours;
    }

    abstract int getSalary();

    public int getPercentageForWorkedHours() {
        return ((workedHours * HUNDRED_PERCENT) / MONTHLY_WORKED_HOURS);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public int getRate() {
        return rate;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return rate == employee.rate &&
                workedHours == employee.workedHours &&
                id.equals(employee.id) &&
                firstName.equals(employee.firstName) &&
                lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, rate, workedHours);
    }
}
