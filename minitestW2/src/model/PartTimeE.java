package model;

import java.io.Serializable;

public class PartTimeE extends Employee implements Serializable {
    private double numberHourWork;

    public PartTimeE() {
    }

    public PartTimeE(double numberHourWork) {
        this.numberHourWork = numberHourWork;
    }

    public double getWage() {
        return (numberHourWork * 1000000);
    }

    public PartTimeE(String employeeCode, String name, int age, String number, String email, double numberHourWork) {
        super(employeeCode, name, age, number, email);
        this.numberHourWork = numberHourWork;
    }

    public double getNumberHourWork() {
        return numberHourWork;
    }

    public void setNumberHourWork(double numberHourWork) {
        this.numberHourWork = numberHourWork;
    }

    @Override
    public String toString() {
        return "PartTimeE{" +
                "numberHourWork=" + numberHourWork +
                "Wage = " + getWage() +
                '}';
    }
}