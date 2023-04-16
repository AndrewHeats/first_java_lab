package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor

public abstract class Building {
    private boolean isResidential;
    private int yearOfBuilding;

    abstract double caclucateConstructionPrice();
    public String getHeaders() {
        return "isResidential, yearOfBuildings";
    }
    public String toCSV() {
        return isResidential + ", " + yearOfBuilding;
    }
}
