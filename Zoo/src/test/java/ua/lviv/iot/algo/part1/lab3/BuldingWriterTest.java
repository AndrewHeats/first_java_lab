package ua.lviv.iot.algo.part1.lab3;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuldingWriterTest {
    private static final String RESULT_FILENAME="result.csv";
    private static final String EXPECTED_FILENAME="expected.csv";
    private BuildingWriter writer;
    private List<Building> buildings;
    File file;
    @BeforeEach
    public void setUp(){
        writer = new BuildingWriter();
        buildings = new LinkedList<>();

    }
    /*@AfterEach
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }*/
    @Test
    public void testEmptyWrite() throws IOException {
        writer = new BuildingWriter();
        writer.write(null);
        //check if expected file contains the same data as written
        File file = new File(RESULT_FILENAME);
        Assertions.assertFalse(file.exists());
    }
    @Test
    public void testWriteListOfBuildings() throws IOException {
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
        writer = new BuildingWriter();
        writer.WriteToFileForLevel3(buildings);
        //check if expected file contains the same data as written
        File file = new File(RESULT_FILENAME);
        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();;
        Assertions.
                assertEquals(-1L,
                        Files.mismatch(expected,actual));

    }
    @Test
    public void testFileOverride() throws IOException {
        File file = new File("result.csv");
        FileWriter fwriter = new FileWriter(file);
        fwriter.write("khfhgortjpkpkgrojioerjio");
        //create result csv, write some content here
        testWriteListOfBuildings();
    }

}
