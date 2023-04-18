package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@ToString(callSuper = true)
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


    @Override
    public double caclucateConstructionPrice() {
        System.out.println((numberOfStudents / numberOfTeachers) * 10000 + " this is how much this school which has name " + name + " costs");
        return (numberOfStudents / numberOfTeachers) * 10000;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", numberOfStudents, numberOfTeachers, name";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + numberOfStudents + ", " + numberOfTeachers + ", " + name;
    }
}
