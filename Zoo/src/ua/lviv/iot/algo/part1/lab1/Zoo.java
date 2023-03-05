package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Zoo {
    private String name;
    private String location;
    private double area;
    private int capacity;
    private static Zoo instance;
    public static Zoo getInstance() {
        if (instance == null) {
            return new Zoo();
        }
        return instance;
    }
    @Override
    public String toString() {
        return ("This " + name
                + " zoo has capacity " + capacity
                + " animals, has area " + area
                + " km^2, also it locates in " + location);
    }
    public void increaseCapacity(int number) {
        capacity = capacity + number;
    }
    public double splitArea() {
        if (area == 0) {
            System.out.println("Nothing to split");
            return area;
        }
        area = area / 2;
        return area;
    }
    public double addNewRegion(double area) {
        location = location + " and New Region";
        this.area = this.area + area;
        return this.area;
    }
    public static void main(String[] args) {
        Zoo[] zoos;
        zoos = new Zoo[4];
        //Making object with default constructor
        zoos[0] = new Zoo();
        zoos[0].setArea(200.5);
        zoos[0].setName("Hoshin");
        zoos[0].setCapacity(1000);
        zoos[0].setLocation("Tokyo");
        //Making object with constructor with all arguments
        zoos[1] = new Zoo("Limpopo", "Lviv", 100.5, 600);
        //Making objects with get instance method
        zoos[2] = getInstance();
        zoos[3] = getInstance();
        //Use function to assure that function do what we need
        zoos[0].addNewRegion(49.8);
        System.out.println(zoos[0]);
        //Use function to assure that function do what we need
        zoos[0].increaseCapacity(100);
        System.out.println(zoos[0]);
        //Use function to assure that function do what we need
        zoos[0].splitArea();
        System.out.println(zoos[0]);
        //print all objects
        int i = 0;
        while (i < zoos.length) {
            System.out.println(zoos[i]);
            i++;
        }
    }
}

