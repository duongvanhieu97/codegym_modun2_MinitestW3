package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class CrispyFlour extends Material implements Discount, Serializable {
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        Period different = Period.between(getExpiryDate(), LocalDate.now());
        if (different.getDays() <= 60) {
            return getAmount() / 100 * 60;
        } else return getAmount() / 100 * 95;
    }

    @Override
    public String toString() {
        return "controller.CrispyFlour{" +
                "quantity=" + quantity +
                '}';
    }
}