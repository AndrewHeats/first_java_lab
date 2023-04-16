package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@NoArgsConstructor

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

    @Override
    public double caclucateConstructionPrice() {
        System.out.println(maxNumberOfPeople * 5000 / numberOfCashier + " you need to build this bank");
        return maxNumberOfPeople * 5000 / numberOfCashier;
    }
    @Override
    public String getHeaders() {
        return super.getHeaders() + ", numberOfCashier, openCloseHours, maxNumberOfPeople";
    }
    @Override
    public String toCSV() {
        return super.toCSV() + ", " + numberOfCashier + ", " + openCloseHours + ", " + maxNumberOfPeople;
    }

}
