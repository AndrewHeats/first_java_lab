import ua.lviv.iot.algo.part1.lab3.School;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SchoolTest extends School {
    School school = new School(720, 50, "LPML", true, 1980);
    @Test
    public void testCalculateConstructionPrice(){
        assertEquals(140000.0, school.caclucateConstructionPrice(),0.001);
    }
    @Test
    public void testGetNumberOfStudents(){
        assertEquals(720, school.getNumberOfStudents());
    }
    @Test
    public void testGetNumberOfTeachers(){
        assertEquals(50, school.getNumberOfTeachers());
    }
    @Test
    public void testGetName(){
        assertEquals("LPML", school.getName());
    }
}
