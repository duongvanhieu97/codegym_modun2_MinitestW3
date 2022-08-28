package storage;

import controller.MaterialManager;
import model.CrispyFlour;
import model.Material;
import model.Meat;
import view.Main;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialFile implements Serializable {
    public static void writeFile(List<Material> materials){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("material.txt");
            ObjectOutputStream ost = new ObjectOutputStream(fileOutputStream);
            ost.writeObject(materials);
            ost.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Material> readFile(){
        try {
            FileInputStream fis = new FileInputStream("material.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List<Material> employees = (List<Material>) ob;
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
    public static void main(String[] args) {
        List<Material> materials = new ArrayList<>();

        CrispyFlour botMi = new CrispyFlour("1", "Bột Mì", LocalDate.of(2022, 7, 8), 9000, 5);
        CrispyFlour botNgo = new CrispyFlour("2", "Bột Ngô", LocalDate.of(2022, 8, 15), 9000, 3);
        CrispyFlour botSan = new CrispyFlour("3", "Bột Sắn", LocalDate.of(2022, 8, 14), 9000, 2);
        CrispyFlour botGao = new CrispyFlour("4", "Bột Gạo", LocalDate.of(2022, 8, 12), 9000, 8);
        CrispyFlour botNep = new CrispyFlour("5", "Bột Nếp", LocalDate.of(2022, 8, 18), 9000, 3);
        Meat thitLon = new Meat("6", "Thịt Lợn", LocalDate.of(2022, 8, 16), 12000, 10);
        Meat thitGa = new Meat("7", "Thịt Gà", LocalDate.of(2022, 8, 16), 12000, 4);
        Meat thitCa = new Meat("8", "Thịt Cá", LocalDate.of(2022, 8, 16), 12000, 6);
        Meat thitBo = new Meat("9", "Thịt Bò", LocalDate.of(2022, 8, 16), 12000, 3);
        Meat thitVit = new Meat("10", "Thịt Vịt", LocalDate.of(2022, 8, 16), 12000, 7);
        materials.add(botMi);
        materials.add(botNgo);
        materials.add(botSan);
        materials.add(botGao);
        materials.add(botNep);
        materials.add(thitLon);
        materials.add(thitGa);
        materials.add(thitCa);
        materials.add(thitBo);
        materials.add(thitVit);
        writeFile(materials);
//        Material meat = getMeat();
//        Material crispy = getCrispyFlour();
//        materials.add(meat);
//        materials.add(crispy);
//        materials.showNewMaterial();
//        materials.deleteMaterial(thitLon);
//        materials.showNewMaterial();
    }
}
