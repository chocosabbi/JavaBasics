package com.learn.inheritance;

public class Manager extends Employee {

    //overrides the original getAnnualSalary from the Employee model
    //replaces the salary with this one
    @Override
    public double getAnnualSalary() {
        return super.getAnnualSalary() + 10000;
    }

    @Override
    public int getId() {
        return super.getId() + 100;
    }

    @Override
    public String toString() {
        return this.getId() + ", "
                + this.getFirstName() + ", "
                + this.getLastName() + ", "
                + this.getAnnualSalary();
    }
}
