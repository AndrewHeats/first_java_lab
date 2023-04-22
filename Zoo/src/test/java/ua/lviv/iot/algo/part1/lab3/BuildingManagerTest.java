package ua.lviv.iot.algo.part1.lab3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuildingManagerTest extends BuildingManager {
    List<Building> buildings = new ArrayList<>();
    BuildingManager manager;
    Building building1 = new Zoo("Hoshin", "Tokyo", 200.5, 100, false, 2001);
    Building building2 = new Bank(8, "10:00-21:00", 25, false, 1996);
    Building building3 = new School(720, 50, "LPML", true, 1980);
    Building building4 = new Library(10000, 5, "Stepana Bandery str.", false, 2004);

    @Before
    public void setUp() {
        buildings.add(building1);
        buildings.add(building2);
        buildings.add(building3);
        buildings.add(building4);
        manager = new BuildingManager(buildings);
    }

    @Test
    public void testFindBuildingsBuiltAfter() {
        List<Building> expectedBuildings = new ArrayList<>();
        expectedBuildings.add(building1);
        expectedBuildings.add(building4);

        List<Building> actualBuildings = manager.findBuildingsBuiltAfter(2000);
        assertEquals(expectedBuildings, actualBuildings);
    }

    @Test
    public void testFindResidential() {
        List<Building> expectedBuildings = new ArrayList<>();
        expectedBuildings.add(building3);

        List<Building> actualBuildings = manager.findResidential();
        for (Building building : actualBuildings) {
            assertTrue(building.isResidential());
        }
    }


}
