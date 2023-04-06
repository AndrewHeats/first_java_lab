package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Setter
@Getter
public class Library extends Building {
    private int moneyEquivavlent=500;
    private int numberOfBooks;
    private int numberOfHalls;
    private String address;

    public Library(int numberOfBooks, int numberOfHalls, String address, boolean isResidential, int yearOfBuilding) {
        super(isResidential, yearOfBuilding);
        this.numberOfBooks = numberOfBooks;
        this.numberOfHalls = numberOfHalls;
        this.address = address;
    }

    public Library() {
    }

    @Override
    public double caclucateConstructionPrice() {
        System.out.println(numberOfBooks / numberOfHalls * moneyEquivavlent + " this is how much this library which located on " + address + " costs");
        return numberOfBooks / numberOfHalls * moneyEquivavlent;
    }
}
