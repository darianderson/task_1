package com.tsyhanok;

public class Programmer extends Employee {

    public Programmer(Long id, String firstName, String lastName, int rate, int workedHours){
        super(id,firstName,lastName,rate,workedHours);
    }

    @Override
    public int getSalary() {
        return (getRate() * getPercentageForWorkedHours()) / HUNDRED_PERCENT;
    }

}
