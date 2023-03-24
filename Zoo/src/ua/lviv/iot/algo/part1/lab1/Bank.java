package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@ToString
@Setter
@Getter

public class Bank extends Building{
    private int numberOfCashier;
    private String openCloseHours;
    private int maxNumberOfPeople;

    public Bank(int numberOfCashier, String openCloseHours, int maxNumberOfPeople, boolean isResidential, int yearOfBuilding) {
        super (isResidential, yearOfBuilding);
        this.numberOfCashier = numberOfCashier;
        this.openCloseHours = openCloseHours;
        this.maxNumberOfPeople = maxNumberOfPeople;

    }
    public Bank(){}

    @Override
    public String toString() {
        return "Bank{" +
                "numberOfCashier=" + numberOfCashier +
                ", openCloseHours='" + openCloseHours + '\'' +
                ", maxNumberOfPeople=" + maxNumberOfPeople +
                ", isResidential=" + isResidential +
                ", yearOfBuilding=" + yearOfBuilding +
                '}';
    }
    @Override
    void caclucateConstructionPrice() {
        System.out.println(maxNumberOfPeople*50000/numberOfCashier + " uah this bank cost");
    }
}
