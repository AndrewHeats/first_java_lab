package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString(callSuper = true)
@NoArgsConstructor
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


    @Override
    public double caclucateConstructionPrice() {
        System.out.println(numberOfBooks / numberOfHalls * 500 + " this is how much this library which located on " + address + " costs");
        return numberOfBooks / numberOfHalls * 500;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", numberOfBooks, numberOfHalls, address";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + numberOfBooks + ", " + numberOfHalls + ", " + address;
    }
}
