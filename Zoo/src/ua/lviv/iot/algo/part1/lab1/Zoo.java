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
    public static void main(String[] args) {
        Zoo[] zoos = {
                new Zoo(),
                new Zoo("Limpopo", "Lviv", 100.5, 600),
                Zoo.getInstance(),
                Zoo.getInstance()
        };

        for(Zoo zoo: zoos){
            System.out.println(zoo);
        }
    }
}