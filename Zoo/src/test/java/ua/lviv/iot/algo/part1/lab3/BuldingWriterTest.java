package ua.lviv.iot.algo.part1.lab3;

import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.LinkedList;
import java.util.List;


public class BuldingWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";
    private BuildingWriter writer;
    private List<Building> buildings;

    @Before
    public void setUp() {
        writer = new BuildingWriter();
        buildings = new LinkedList<>();
        Building building1 = new Zoo("Hoshin", "Tokyo", 200.5, 100, false, 2001);
        Building building2 = new Bank(8, "10:00-21:00", 25, false, 1996);
        Building building3 = new School(720, 50, "LPML", true, 1980);
        Building building4 = new Library(10000, 5, "Stepana Bandery str.", false, 2004);
        Building building5 = new Zoo();
        Building building6 = new Bank();
        Building building7 = new School();
        Building building8 = new Library();
        buildings.add(building1);
        buildings.add(building2);
        buildings.add(building3);
        buildings.add(building4);
        buildings.add(building5);
        buildings.add(building6);
        buildings.add(building7);
        buildings.add(building8);

    }

    /*@AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }*/
    @Test
    public void testEmptyWrite() throws IOException {
        writer = new BuildingWriter();
        //check if expected file contains the same data as written
        Assertions.assertNull(writer.writeToFileForLevel3(null));
    }

    @Test
    public void testWriteListOfBuildings() throws IOException {
        writer.writeToFileForLevel3(buildings);
        //check if expected file contains the same data as written
        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();
        ;
        Assertions.
                assertEquals(-1L,
                        Files.mismatch(expected, actual));

    }

    @Test
    public void testFileOverride() throws IOException {
        FileWriter fwriter = new FileWriter(RESULT_FILENAME);
        fwriter.write("khfhgortjpkpkgrojioerjio");
        fwriter.close();
        //create result csv, write some content here
        testWriteListOfBuildings();
    }

}
