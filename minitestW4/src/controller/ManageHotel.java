package controller;

import model.Discount;
import model.Hotel;
import model.Person;
import storage.HotelFile;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ManageHotel {
    public static List<Hotel> hotelList;

    static {
        hotelList = HotelFile.readFile();
    }

    public void addRender(Hotel hotel) {
        hotelList.add(hotel);
        HotelFile.writeFile(hotelList);
    }
    public void addProductToList(List<Hotel> hotelList) {
//        add vào hotel
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số Ngày Trọ");
        int numberOfRentalDays = scanner.nextInt();
        System.out.println("Nhập Loại Phòng Trọ");
        String typeRoom = scanner.nextLine();
        System.out.println("Giá phòng");
        double priceRoom = scanner.nextDouble();
//        add vào person
        System.out.println("Nhập Họ và Tên");
        String fullName = scanner.nextLine();
        System.out.println("Nhập số ngày tháng năm sinh");
        System.out.println("Nhập số năm");
        int year = scanner.nextInt();
        System.out.println("Nhập số tháng");
        int month = scanner.nextInt();
        System.out.println("Nhập số ngày");
        int day = scanner.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        System.out.println("Nhập số Chứng Minh Nhân Dân");
        String identityCard = scanner.nextLine();
        Person person = new Person(numberOfRentalDays,typeRoom,priceRoom,fullName,date,identityCard);
        hotelList.add(person);
        HotelFile.writeFile(hotelList);
    }
    public void deleteProductToList(List<Hotel> hotelList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số Chứng Minh Nhân Dân cần tìm");
        String identityCard = scanner.nextLine();
        for (int i = 0; i < hotelList.size() ; i++) {
            if (hotelList.get(i) instanceof Person) {
                if (hotelList.get(i).getIdentityCard().equals(identityCard)){
                    hotelList.remove(hotelList.get(i));
                }
                HotelFile.writeFile(hotelList);
            }else {
                System.out.println("Không có số CMND cần tìm");
            }
        }
    }
    public double payMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số CMND");
        String identityCard = scanner.nextLine();
        double totalPrice = 0.0;
        for (int i = 0; i < hotelList.size() ; i++) {
            if (hotelList.get(i) instanceof Discount) {
                if (hotelList.get(i).getIdentityCard().equals(identityCard)) {
                    totalPrice = ((Discount) hotelList.get(i)).payMoney();
                }
            }
        }
        return totalPrice;
    }
}
