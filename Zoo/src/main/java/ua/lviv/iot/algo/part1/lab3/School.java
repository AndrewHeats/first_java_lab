package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
public class School extends Building {
    private int moneyEquivavlent=10000;
    private int numberOfStudents;
    private int numberOfTeachers;
    private String name;

    public School(int numberOfStudents, int numberOfTeachers, String name, boolean isResidential, int yearOfBuilding) {
        super(isResidential, yearOfBuilding);
        this.numberOfStudents = numberOfStudents;
        this.numberOfTeachers = numberOfTeachers;
        this.name = name;
    }

    public School() {
    }

    @Override
    public double caclucateConstructionPrice() {
        System.out.println((numberOfStudents / numberOfTeachers) * moneyEquivavlent + " this is how much this school which has name " + name + " costs");
        return (numberOfStudents / numberOfTeachers) * moneyEquivavlent;
    }
}
