package model;

import java.io.Serializable;

public class FullTimeE extends Employee implements Serializable {
    private double bonusMoney;
    private double punishMoney;
    private double hardSalary;

    public FullTimeE() {
    }

    public FullTimeE(double bonusMoney, double punishMoney, double hardSalary) {
        this.bonusMoney = bonusMoney;
        this.punishMoney = punishMoney;
        this.hardSalary = hardSalary;
    }

    public FullTimeE(String employeeCode, String name, int age, String number, String email, double bonusMoney, double punishMoney, double hardSalary) {
        super(employeeCode, name, age, number, email);
        this.bonusMoney = bonusMoney;
        this.punishMoney = punishMoney;
        this.hardSalary = hardSalary;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getPunishMoney() {
        return punishMoney;
    }

    public void setPunishMoney(double punishMoney) {
        this.punishMoney = punishMoney;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getWage() {
        return bonusMoney + (punishMoney - hardSalary);
    }

    @Override
    public String toString() {
        return "FullTimeE{" +
                "bonusMoney=" + bonusMoney +
                ", punishMoney=" + punishMoney +
                ", hardSalary=" + hardSalary +
                ", wage = " + getWage() +
                '}';
    }
}