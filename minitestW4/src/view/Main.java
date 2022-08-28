package view;

import controller.ManageHotel;
import model.Hotel;
import model.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Hotel> hotelList = ManageHotel.hotelList;

    public static void main(String[] args) {
        ManageHotel manageHotel = new ManageHotel();
        manageHotel.addRender(new Person(7, "Standard", 12, "Hieu", LocalDate.of(1997, 2, 2), "123456781"));
        manageHotel.addRender(new Person(2, "Superior", 15, "Vinh", LocalDate.of(2001, 3, 4), "123456782"));
        manageHotel.addRender(new Person(3, "Deluxe", 20, "Han", LocalDate.of(1996, 9, 2), "123456783"));
        manageHotel.addRender(new Person(5, "Superior", 15, "Tuan", LocalDate.of(1998, 8, 8), "123456784"));
        manageHotel.addRender(new Person(6, "Suite", 25, "Trung", LocalDate.of(1993, 9, 3), "123456785"));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý ứng dụng Hotel");
            System.out.println("Enter 1 : Thêm sản phẩm");
            System.out.println("Enter 2 : Hiển thị sản phẩm");
            System.out.println("Enter 3 : Xóa sản phẩm");
            System.out.println("Enter 4 : Tính số tiền phải trả khách hàng khi không thuê nữa");
            System.out.println("Enter 0 : Exit");
            int number = scanner.nextInt();
            switch (number) {
                case 1: {
                    manageHotel.addProductToList(hotelList);
                    break;
                }
                case 2: {
                    for (Hotel e : hotelList) {
                        System.out.println(e.toString());

                    }
                    break;
                }
                case 3: {
                    manageHotel.deleteProductToList(hotelList);
                }
                case 4: {
                    System.out.println(manageHotel.payMoney());
                    break;
                }
                case 5: {
                    return;
                }
                default: {
                    System.out.println("Bạn nhập lỗi");
                    continue;
                }
            }
        }
    }
}
