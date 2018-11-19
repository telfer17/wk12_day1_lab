import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static junit.framework.TestCase.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("James", "XX5555", 80000, "Executive", 500000.00);
    }

    @Test
    public void hasName(){
        assertEquals("James", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("XX5555", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000, director.getSalary());
    }

    @Test
    public void hasDepartment(){
        assertEquals("Executive", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(85000.00, director.raiseSalary(5000));
    }

    @Test
    public void canRaiseSalary__negativeValueChecker(){
        assertEquals(85000.00, director.raiseSalary(-5000));
    }

    @Test
    public void canChangeName(){
        director.setName("Ryan");
        assertEquals("Ryan", director.getName());
    }

    @Test
    public void cantChangeName__nullValue(){
        director.setName("");
        assertEquals("James", director.getName());
    }

    @Test
    public void canGetBonus__director(){
        assertEquals(1600.00, director.calculateBonus());
    }

    @Test
    public void hasBudget(){
        assertEquals(500000.00, director.getBudget());
    }
}
