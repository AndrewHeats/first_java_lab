package ua.lviv.iot.algo.part1.lab1;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Building {
    boolean isResidential;
    int yearOfBuilding;

    abstract void caclucateConstructionPrice();

}
