package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person extends Hotel implements Discount, Serializable {
    private String fullName;
    private LocalDate dateOfBirth;
    private String identityCard;

    public Person() {
    }

    public Person(String fullName, LocalDate dateOfBirth, String identityCard) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.identityCard = identityCard;
    }

    public Person(int numberOfRentalDays, String typeRoom, double priceRoom, String fullName, LocalDate dateOfBirth, String identityCard) {
        super(numberOfRentalDays, typeRoom, priceRoom);
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.identityCard = identityCard;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", identityCard='" + identityCard + '\'' +
                '}';
    }

    @Override
    public double payMoney() {
        double total = (getNumberOfRentalDays()/30)*getPriceRoom();
        return total;
    }
}
