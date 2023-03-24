package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Zoo extends Building {
    private String name;
    private String location;
    private double area;
    private int capacity;
    private static Zoo instance;

    public Zoo(String name, String location, double area, int capacity, boolean isResidential, int yearOfBuilding) {
        super (isResidential, yearOfBuilding);
        this.name = name;
        this.location = location;
        this.area = area;
        this.capacity = capacity;

    }
    public Zoo(){
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
    public void caclucateConstructionPrice() {
        System.out.println(area*20000/capacity + " this is how much money you need spend to build zoo named " + name);
    }
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", area=" + area +
                ", capacity=" + capacity +
                ", isResidential=" + isResidential +
                ", yearOfBuilding=" + yearOfBuilding +
                '}';
    }
}