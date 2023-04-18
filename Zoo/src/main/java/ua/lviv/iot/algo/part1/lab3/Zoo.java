package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString(callSuper = true)
@NoArgsConstructor
public class Zoo extends Building {
    private String name;
    private String location;
    private double area;
    private int capacity;

    public Zoo(String name, String location, double area, int capacity, boolean isResidential, int yearOfBuilding) {
        super(isResidential, yearOfBuilding);
        this.name = name;
        this.location = location;
        this.area = area;
        this.capacity = capacity;

    }

    public int increaseCapacity(int number) {
        return capacity += number;
    }

    public double splitArea() {
        return area /= 2;
    }

    public double addNewRegion(double area) {
        location += " and New Region";
        return this.area += area;
    }

    @Override
    public double caclucateConstructionPrice() {
        System.out.println(area * 20000 / capacity + " this is how much money you need spend to build zoo named " + name);
        return area * 20000 / capacity;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", name, location, area, capacity";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + name + ", " + location + ", " + area + ", " + capacity;
    }
}