package ua.lviv.iot.algo.part1.lab3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Building> findBuildingsBuiltAfter(int year) {
        List<Building> temp;
        temp = buildings.stream()
                .filter(building -> building.getYearOfBuilding() > year)
                .collect(Collectors.toList());
        return temp;
    }

    public List<Building> findResidential() {
        List<Building> temp;
        temp = buildings.stream()
                .filter(Building::isResidential)
                .collect(Collectors.toList());
        return temp;
    }
    public List<Building> sortBuildings() {
        return buildings.stream()
                .sorted(Comparator.comparingInt(building -> {
                    if (building instanceof Zoo) {
                        return 0;
                    } else if (building instanceof Bank) {
                        return 1;
                    } else if (building instanceof Library) {
                        return 2;
                    } else if (building instanceof School) {
                        return 3;
                    } else {
                        return 4;
                    }
                }))
                .toList();
    }

    public static void main(String[] args) throws IOException {
        List<Building> buildings = new ArrayList<Building>();
        BuildingManager manager = new BuildingManager(buildings);
        Building building1 = new Zoo("Hoshin", "Tokyo", 200.5, 100, false, 2001);
        Building building2 = new Bank(8, "10:00-21:00", 25, false, 1996);
        Building building3 = new School(720, 50, "LPML", true, 1980);
        Building building4 = new Library(10000, 5, "Stepana Bandery str.", false, 2004);
        Building building5 = new Zoo();
        Building building6 = new Bank();
        Building building7 = new School();
        Building building8 = new Library();
        manager.addBuilding(building1);
        manager.addBuilding(building5);
        manager.addBuilding(building2);
        manager.addBuilding(building6);
        manager.addBuilding(building3);
        manager.addBuilding(building7);
        manager.addBuilding(building4);
        manager.addBuilding(building8);
        BuildingWriter buildingWriter = new BuildingWriter();
        buildingWriter.write(buildings);
    }
}
