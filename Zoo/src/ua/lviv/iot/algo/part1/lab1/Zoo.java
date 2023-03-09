package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Zoo {
    private String name;
    private String location;
    private double area;
    private int capacity;
    private static ua.lviv.iot.algo.part1.lab1.Zoo instance;

    public static ua.lviv.iot.algo.part1.lab1.Zoo getInstance() {
        if (instance == null) {
            return new ua.lviv.iot.algo.part1.lab1.Zoo();
        }
        return instance;
    }
    @Override
    public String toString() {
        return ("This "+ name + "zoo has capacity " + capacity + " animals, has area " + area + " km^2, also it locates in " + location);
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
    public static void main(String[] args) {
        ua.lviv.iot.algo.part1.lab1.Zoo[] zoos;
        zoos = new ua.lviv.iot.algo.part1.lab1.Zoo[4];
        zoos[0] = new ua.lviv.iot.algo.part1.lab1.Zoo();
        zoos[0].setArea(200.5);
        zoos[0].setName("Hoshin");
        zoos[0].setCapacity(1000);
        zoos[0].setLocation("Tokyo");
        zoos[1] = new ua.lviv.iot.algo.part1.lab1.Zoo("Limpopo", "Lviv", 100.5, 600);
        zoos[2] = getInstance();
        zoos[3] = getInstance();
        int i = 0;
        while (i < zoos.length) {
            System.out.println(zoos[i]);
            i++;
        }
    }