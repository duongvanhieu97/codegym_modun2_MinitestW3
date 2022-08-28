package controller;

import model.Discount;
import model.Material;
import storage.MaterialFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MaterialManager implements Discount, Serializable {


    public static List<Material> materialList;

    static {
        materialList = MaterialFile.readFile();
    }
    public void addNewMaterial(Material material) {
        materialList.add(material);
        MaterialFile.writeFile(materialList);
    }

    public void deleteMaterial(Material material) {
        materialList.remove(material);
    }

    public void showNewMaterial() {
        for (int i = 0; i < materialList.size(); i++) {
            System.out.println(materialList.get(i));
        }
    }

    //    Tổng tiền
    public double getTotalMoney() {
        double total = 0;
        for (int i = 0; i < materialList.size(); i++) {
            total += materialList.get(i).getAmount();
        }
        return total;
    }

    //    tổng tiền sau giảm giá
    public double getRealMoney() {
        double total = 0;
        for (int i = 0; i < materialList.size(); i++) {
            if (materialList.get(i) instanceof Discount) {
                Discount discount = (Discount) materialList.get(i);
                total += discount.getRealMoney();
            }
        }
        return total;
    }

    //    Tính chênh lệnh
    public double getDifference() {
        double difference = getTotalMoney() - getRealMoney();
        return difference;
    }

}
