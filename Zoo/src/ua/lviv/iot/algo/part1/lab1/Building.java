package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public abstract class Building {
    private boolean isResidential;
    private int yearOfBuilding;

    abstract void caclucateConstructionPrice();

}
