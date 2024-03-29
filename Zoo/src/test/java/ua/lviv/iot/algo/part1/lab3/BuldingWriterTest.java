package ua.lviv.iot.algo.part1.lab3;

import org.junit.Before;
import org.junit.Test;

import org.junit.jupiter.api.Assertions;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class BuldingWriterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";
    private BuildingWriter writer;
    private List<Building> buildings;

    @Before
    public void setUp() {
        writer = new BuildingWriter();
        buildings = new LinkedList<>();
        buildings.add(new Zoo("Hoshin", "Tokyo", 200.5, 100, false, 2001));
        buildings.add(new Bank(8, "10:00-21:00", 25, false, 1996));
        buildings.add(new School(720, 50, "LPML", true, 1980));
        buildings.add(new Library(10000, 5, "Stepana Bandery str.", false, 2004));
        buildings.add(new Zoo());
        buildings.add(new Bank());
        buildings.add(new School());
        buildings.add(new Library());
    }

    @Test
    public void testEmptyWrite() throws IOException {
        writer = new BuildingWriter();
        Assertions.assertNull(writer.writeToFileForLevel3(null));
    }

    @Test
    public void testWriteListOfBuildings() throws IOException {
        writer.writeToFileForLevel3(buildings);
        //check if expected file contains the same data as written
        Path expected = new File(RESULT_FILENAME).toPath();
        Path actual = new File(EXPECTED_FILENAME).toPath();
        ;
        Assertions
                .assertEquals(-1L,
                        Files.mismatch(expected, actual));
    }

    @Test
    public void testFileOverride() throws IOException {
        try (FileWriter fwriter = new FileWriter(RESULT_FILENAME)) {
            fwriter.write("Some useful information");
        }
        testWriteListOfBuildings();
    }

}
