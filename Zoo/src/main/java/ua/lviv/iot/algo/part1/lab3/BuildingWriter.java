package ua.lviv.iot.algo.part1.lab3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BuildingWriter {
    public String writeToFile(List<Building> buildings) throws IOException {
        if (buildings==null||buildings.isEmpty()){
            return null;
        }
        String defaultFileName ="result.csv";
        try (FileWriter writer
                     = new FileWriter(defaultFileName)){
            for(var building:buildings){
                writer.write(building.getHeaders());
                writer.write("\n");
                writer.write(building.toCSV());
                writer.write("\n");
            }
        }
        return defaultFileName;
    }
    public String writeToFileForLevel3(List<Building> buildings) throws IOException {
        if (buildings==null||buildings.isEmpty()){
            return null;
        }
        BuildingManager manager = new BuildingManager(buildings);
        List<Building> sortedBuildings = manager.sortBuildings();
        String defaultFileName ="result.csv";
        try (FileWriter writer
                     = new FileWriter(defaultFileName)) {
            Building buildingType = sortedBuildings.get(0);
            writer.write(sortedBuildings.get(0).getHeaders());
            writer.write("\n");
            for (var building : sortedBuildings) {
                if (buildingType.getClass() != building.getClass()) {
                    buildingType = building;
                    writer.write(building.getHeaders());
                    writer.write("\n");
                }
                writer.write(building.toCSV());
                writer.write("\n");
            }
        return defaultFileName;
        }

    }
}

