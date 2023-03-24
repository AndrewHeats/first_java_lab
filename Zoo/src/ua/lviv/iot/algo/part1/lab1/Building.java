package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Building {
    boolean isResidential;
    int yearOfBuilding;

    /*public Building(boolean isResidential, int yearOfBuilding) {
        this.isResidential = isResidential;
        this.yearOfBuilding = yearOfBuilding;
    }*/

    abstract void caclucateConstructionPrice();

}
