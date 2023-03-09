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
    private static Zoo instance;

    public static Zoo getInstance() {
        if (instance == null) {
            return new Zoo();
        }
        return instance;
    }
    @Override
    public String toString() {
        return ("This %s zoo has capacity %d animals, has area %d km^2, also it locates in %s", name, capacity,area,location);
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
        Zoo[] zoos;
        zoos = new Zoo[4];
        zoos[0] = new Zoo();
        zoos[0].setArea(200.5);
        zoos[0].setName("Hoshin");
        zoos[0].setCapacity(1000);
        zoos[0].setLocation("Tokyo");
        zoos[1] = new Zoo("Limpopo", "Lviv", 100.5, 600);
        zoos[2] = getInstance();
        zoos[3] = getInstance();
        int i = 0;
        while (i < zoos.length) {
            System.out.println(zoos[i]);
            i++;
        }
    }
}

