package storage;

import model.Employee;
import model.FullTimeE;
import model.PartTimeE;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFile implements Serializable {
    public static void writeFile(List<Employee> employees){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("employee.txt");
            ObjectOutputStream ost = new ObjectOutputStream(fileOutputStream);
            ost.writeObject(employees);
            ost.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Employee> readFile(){
        try {
            FileInputStream fis = new FileInputStream("employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List<Employee> employees = (List<Employee>) ob;
            ois.close();
            fis.close();
            return employees;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
//
//    public static void main(String[] args) {
//        Employee e1 = new FullTimeE("33981", "Hiếu", 24, "0924133124", "email1", 3100, 1000, 4000);
//        Employee e2 = new FullTimeE("32241", "Vinh", 20, "0923458712", "email2", 3400, 1200, 4300);
//        Employee e3 = new FullTimeE("12345", "Tuấn", 23, "0947587482", "email3", 3500, 1300, 4400);
//        Employee e4 = new FullTimeE("13451", "Hân", 25, "0924133124", "email4", 3700, 1400, 4100);
//        Employee e5 = new FullTimeE("34633", "Trung", 27, "0924133124", "email5", 3200, 1200, 4200);
//        Employee e6 = new PartTimeE("14366", "Hoàng", 22, "0923485812", "email6", 8);
//        Employee e7 = new PartTimeE("83744", "Quân", 27, "0923485812", "email7", 6);
//        Employee e8 = new PartTimeE("12394", "Huy", 22, "0923485812", "email8", 5);
//        Employee e9 = new PartTimeE("58412", "Phong", 22, "0923485812", "email9", 3);
//        Employee e10 = new PartTimeE("43912", "Lương", 24, "0923485812", "email10", 4);
//        List<Employee> employees = new ArrayList<>();
//        employees.add(e1);
//        employees.add(e2);
//        employees.add(e3);
//        employees.add(e4);
//        employees.add(e5);
//        employees.add(e6);
//        employees.add(e7);
//        employees.add(e8);
//        employees.add(e9);
//        employees.add(e10);
//        writeFile(employees);
//
////        List<Employee> employees = readFile();
////        System.out.println(employees);
//
//    }
}
