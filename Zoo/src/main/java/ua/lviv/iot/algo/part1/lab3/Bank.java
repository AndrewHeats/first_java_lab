package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter

public class Bank extends Building {
    private int moneyEquivavlent=5000;
    private int numberOfCashier;
    private String openCloseHours;
    private int maxNumberOfPeople;

    public Bank(int numberOfCashier, String openCloseHours, int maxNumberOfPeople, boolean isResidential, int yearOfBuilding) {
        super(isResidential, yearOfBuilding);
        this.numberOfCashier = numberOfCashier;
        this.openCloseHours = openCloseHours;
        this.maxNumberOfPeople = maxNumberOfPeople;

    }

    public Bank() {
    }

    @Override
    public double caclucateConstructionPrice() {
        System.out.println(maxNumberOfPeople * moneyEquivavlent / numberOfCashier + " you need to build this bank");
        return maxNumberOfPeople * moneyEquivavlent / numberOfCashier;
    }
}
