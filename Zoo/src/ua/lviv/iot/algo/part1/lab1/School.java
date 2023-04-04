package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString(callSuper = true)
@Setter
@Getter
public class School extends Building {
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
    void caclucateConstructionPrice() {
        System.out.println((numberOfStudents / numberOfTeachers) * 10000 + " this is how much this school which has name " + name + " costs");
    }
}
