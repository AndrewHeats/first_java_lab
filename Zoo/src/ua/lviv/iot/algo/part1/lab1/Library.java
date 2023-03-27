package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString(callSuper = true)
public class Library extends Building {
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
    void caclucateConstructionPrice() {
        System.out.println(numberOfBooks / numberOfHalls * 500 + " this is how much this library which located on " + address + " costs");
    }
}
