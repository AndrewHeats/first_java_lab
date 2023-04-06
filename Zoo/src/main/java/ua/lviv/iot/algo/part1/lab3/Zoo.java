package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Zoo extends Building {
    private int moneyEquivavlent=20000;
    private String name;
    private String location;
    private double area;
    private int capacity;
    private static Zoo instance;

    public Zoo(String name, String location, double area, int capacity, boolean isResidential, int yearOfBuilding) {
        super(isResidential, yearOfBuilding);
        this.name = name;
        this.location = location;
        this.area = area;
        this.capacity = capacity;

    }

    public Zoo() {
    }

    public static Zoo getInstance() {
        return instance;
    }

    public void increaseCapacity(int number) {
        capacity += number;
    }

    public void splitArea() {
        area /= 2;
    }

    public void addNewRegion(double area) {
        location += " and New Region";
        this.area += area;
    }

    @Override
    public double caclucateConstructionPrice() {
        System.out.println(area * moneyEquivavlent / capacity + " this is how much money you need spend to build zoo named " + name);
        return (area * moneyEquivavlent / capacity);
    }
}