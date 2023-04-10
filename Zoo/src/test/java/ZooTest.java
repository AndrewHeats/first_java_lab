import org.junit.Test;
import ua.lviv.iot.algo.part1.lab3.Zoo;

import static org.junit.Assert.assertEquals;
public class ZooTest extends Zoo {
    Zoo zoo = new Zoo("Hoshin", "Tokyo", 200.5, 100, false, 2001);
    @Test
    public void testCalculateConstructionPrice(){
        assertEquals(40100.0, zoo.caclucateConstructionPrice(),0.001);
    }
    @Test
    public void testGetName(){
        assertEquals("Hoshin", zoo.getName());
    }
    @Test
    public void testGetLocation(){
        assertEquals("Tokyo", zoo.getLocation());
    }
    @Test
    public void testGetArea(){
        assertEquals(200.5, zoo.getArea(),0.001);
    }
    @Test
    public void testGetCapacity(){
        assertEquals(100, zoo.getCapacity());
    }
    @Test
    public void testSplitArea() {
        assertEquals(100.25, zoo.splitArea(),0.001);
    }
    @Test
    public void testIncreaseCapacity() {
        assertEquals(150, zoo.increaseCapacity(50));
    }
    @Test
    public void testAddNewRegion() {
        assertEquals(201.0, zoo.addNewRegion(0.5),0.001);
    }
}
