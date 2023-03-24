package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;

public class BuildingManager {
    private List<Building> buildings;
    public static void main(String[] args) {
        List<Building> buildings= new ArrayList<Building>();
        buildings.add(new Zoo("Hoshin", "Tokyo", 200.5,100,false,2001));
        buildings.add(new Bank(8,"10:00-21:00",25, false,1996));
        buildings.add(new School(720,50, "LPML",true, 1980));
        buildings.add(new Library(10000,5,"Stepana Bandery str.",false,2004));
        buildings.add(new Zoo());
        buildings.add(new Bank());
        buildings.add(new School());
        buildings.add(new Library());

        
        /*buildings.get(0).caclucateConstructionPrice();
        buildings.get(1).caclucateConstructionPrice();
        buildings.get(2).caclucateConstructionPrice();
        buildings.get(3).caclucateConstructionPrice();*/
        for( Building building: buildings){
            System.out.println(building);
        }
    }
}
