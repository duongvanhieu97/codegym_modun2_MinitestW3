package view;

import controller.EmployeeManager;
import model.Employee;
import model.FullTimeE;

import java.util.List;
import java.util.Scanner;

public class Client {
    private static List<Employee> employees = EmployeeManager.employees;

    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();

        System.out.println("Lương trung bình");
        System.out.println(employeeManager.getAverageWage());
        System.out.println("Danh sách nhân viên lương thấp hơn trung bình");
        System.out.println(employeeManager.lowerThanAverageSalary());
        System.out.println("Tổng số lương phải trả cho nhân viên parttime");
        System.out.println(employeeManager.totalSalaryEmployeePartTime());
    }

}
