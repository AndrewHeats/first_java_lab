package ua.lviv.iot.algo.part1.lab1;

import lombok.ToString;

@ToString
public class Library extends Building{
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
        System.out.println(numberOfBooks/numberOfHalls*500 + " this is how much this library which located on " + address+ " costs");
    }
    @Override
    public String toString() {
        return "Library{" +
                "numberOfBooks=" + numberOfBooks +
                ", numberOfHalls=" + numberOfHalls +
                ", address='" + address + '\'' +
                ", isResidential=" + isResidential +
                ", yearOfBuilding=" + yearOfBuilding +
                '}';
    }
}
