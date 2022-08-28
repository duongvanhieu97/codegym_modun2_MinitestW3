package model;

import java.io.Serializable;

public abstract class Hotel implements Serializable {
    private int numberOfRentalDays;
    private String typeRoom;
    private double priceRoom;

    public Hotel() {
    }

    public Hotel(int numberOfRentalDays, String typeRoom, double priceRoom) {
        this.numberOfRentalDays = numberOfRentalDays;
        this.typeRoom = typeRoom;
        this.priceRoom = priceRoom;
    }

    public int getNumberOfRentalDays() {
        return numberOfRentalDays;
    }

    public void setNumberOfRentalDays(int numberOfRentalDays) {
        this.numberOfRentalDays = numberOfRentalDays;
    }

    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }
    public abstract String getIdentityCard();
    @Override
    public String toString() {
        return "Hotel{" +
                "numberOfRentalDays=" + numberOfRentalDays +
                ", typeRoom='" + typeRoom + '\'' +
                ", priceRoom=" + priceRoom +
                '}';
    }
}
