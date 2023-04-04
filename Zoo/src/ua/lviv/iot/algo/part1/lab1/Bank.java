package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Setter
@Getter

public class Bank extends Building {
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
    void caclucateConstructionPrice() {
        System.out.println(maxNumberOfPeople * 5000 / numberOfCashier + " you need to build this bank");
    }
}
