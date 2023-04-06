import org.junit.Test;
import ua.lviv.iot.algo.part1.lab3.Zoo;

import static org.junit.Assert.assertEquals;
public class ZooTest extends Zoo {
    Zoo zoo = new Zoo("Hoshin", "Tokyo", 200.5, 100, false, 2001);
    @Test
    public void testCalculateConstructionPrice(){
        assertEquals(40100.0, zoo.caclucateConstructionPrice(),0.001);
    }
}