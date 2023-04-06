import org.junit.Test;
import ua.lviv.iot.algo.part1.lab3.Library;

import static org.junit.Assert.assertEquals;
public class LibraryTest extends Library {
    Library library = new Library(10000, 5, "Stepana Bandery str.", false, 2004);
    @Test
    public void testCalculateConstructionPrice(){
        assertEquals(1000000.0, library.caclucateConstructionPrice(),0.001);
    }
}
