package com.tsyhanok;

public class Manager extends Employee {

    public Manager(Long id, String firstName, String lastName, int rate, int workedHours) {
        super(id, firstName, lastName, rate, workedHours);
    }

    @Override
    public int getSalary() {
        if (getPercentageForWorkedHours() < HUNDRED_PERCENT) {
            return (getRate() * getPercentageForWorkedHours()) / HUNDRED_PERCENT;
        }
        return getRate();
    }

}
