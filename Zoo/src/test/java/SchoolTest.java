import ua.lviv.iot.algo.part1.lab3.School;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SchoolTest extends School {
    School school = new School(720, 50, "LPML", true, 1980);
    @Test
    public void testCalculateConstructionPrice(){
        assertEquals(140000.0, school.caclucateConstructionPrice(),0.001);
    }
}
