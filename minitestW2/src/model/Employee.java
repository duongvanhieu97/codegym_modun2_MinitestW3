package model;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    private String employeeCode;
    private String name;
    private int age;
    private String number;
    private String email;

    public Employee() {
    }

    public Employee(String employeeCode, String name, int age, String number, String email) {
        this.employeeCode = employeeCode;
        this.name = name;
        this.age = age;
        this.number = number;
        this.email = email;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getWage ();
    @Override
    public String toString() {
        return "employee.Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }
}