package controller;

import model.Employee;
import model.PartTimeE;
import storage.EmployeeFile;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static List<Employee> employees = EmployeeFile.readFile();

    //    1. Lấy ra lương trung bình
    public float getAverageWage() {
        float sum = 0;
        for (Employee e : employees
        ) {
            sum += e.getWage();
        }
        float average = sum / employees.size();
        return average;
    }

    //    2.Lấy ra danh sách nhân viên lương thấp hơn trung bình
    public ArrayList<Employee> lowerThanAverageSalary() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        float average = getAverageWage();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i) instanceof PartTimeE && employees.get(i).getWage() < average )
                employeeArrayList.add(employees.get(i));
        }
        return employeeArrayList;
    }
//    3. Tổng số lương phải trả cho nhân viên parttime
    public double totalSalaryEmployeePartTime() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        double total = 0.0;
        for (int i = 0; i < employees.size() ; i++) {
            if (employees.get(i) instanceof PartTimeE) {
                employeeArrayList.add(employees.get(i));
                PartTimeE partTimeE = (PartTimeE) employees.get(i);
                total += partTimeE.getWage();
            }
        }
        return total;
    }
}
