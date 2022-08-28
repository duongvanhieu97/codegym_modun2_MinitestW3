package storage;

import controller.ManageHotel;
import model.Hotel;
import model.Person;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelFile {
    public static List<Hotel> readFile() {
        List<Hotel> hotelList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("hotel.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            List<Hotel> hotels = (List<Hotel>) obj;
            ois.close();
            fis.close();
            return hotels;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFile(List<Hotel> hotels) {
        try {
            FileOutputStream fos = new FileOutputStream("hotel.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hotels);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Hotel> hotels = new ArrayList<>();
//        ManageHotel manageHotel = new ManageHotel();

        hotels.add(new Person(7,"Standard",12,"Hieu", LocalDate.of(1997,2,2),"123456789"));
        hotels.add(new Person(2,"Superior",15,"Vinh", LocalDate.of(2001,3,4),"123456789"));
        hotels.add(new Person(3,"Deluxe",20,"Han", LocalDate.of(1996,9,2),"123456789"));
        hotels.add(new Person(5,"Superior",15,"Tuan", LocalDate.of(1998,8,8),"123456789"));
        hotels.add(new Person(6,"Suite",25,"Trung", LocalDate.of(1993,9,3),"123456789"));
        writeFile(hotels);
    }
}
