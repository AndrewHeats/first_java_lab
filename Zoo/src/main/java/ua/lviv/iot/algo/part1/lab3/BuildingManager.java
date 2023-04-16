package ua.lviv.iot.algo.part1.lab3;

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
                    if (building instanceof Bank) {
                        return 0;
                    } else if (building instanceof Zoo) {
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

}
