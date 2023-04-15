package ua.lviv.iot.algo.part1.lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BuildingWriter {
    public String write(List<Building> buildings){
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
        }catch(IOException e){

        }
        return defaultFileName;
    }
    public String WriteToFileForLevel3(List<Building> buildings) throws IOException {
        if (buildings==null||buildings.isEmpty()){
            return null;
        }
        String defaultFileName ="result.csv";
        File csvOutputFile = new File(defaultFileName);
        try (FileWriter writer
                     = new FileWriter(defaultFileName)) {
            Building buildingType = buildings.get(0);
            writer.write(buildings.get(0).getHeaders());
            writer.write("\n");
            for (var building : buildings) {
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

