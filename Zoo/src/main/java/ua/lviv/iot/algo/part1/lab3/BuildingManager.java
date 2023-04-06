package ua.lviv.iot.algo.part1.lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BuildingManager {
    protected List<Building> buildings;

    public BuildingManager() {
    }

    public BuildingManager(List<Building> buildings) {
        this.buildings = buildings;
    }
    public void addBuilding(final Building building) {
        buildings.add(building);
    }

    public List<Building> findBuildingsBuiltAfter(int year){
        List<Building> temp;
       temp=buildings.stream().
                filter(building -> building.getYearOfBuilding() > year).
                collect(Collectors.toList());
       return temp;
    }
    public List<Building> findResidential(){
        List<Building> temp;
        temp=buildings.stream().
                filter(Building:: isResidential).
                collect(Collectors.toList());
        return temp;
    }

}
