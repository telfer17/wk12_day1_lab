import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static junit.framework.TestCase.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("John", "AB1111", 40000);
    }

    @Test
    public void hasName(){
        assertEquals("John", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AB1111", developer.getNINumber());;
    }

    @Test
    public void hasSalary(){
        assertEquals(40000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(41000.00, developer.raiseSalary(1000));
    }

    @Test
    public void canRaiseSalary__negativeValueChecker(){
        assertEquals(50000.00, developer.raiseSalary(-10000));
    }

    @Test
    public void canGetBonus(){
        assertEquals(400.00, developer.calculateBonus());
    }

    @Test
    public void canChangeName(){
        developer.setName("James");
        assertEquals("James", developer.getName());
    }

    @Test
    public void cantChangeName__nullValue(){
        developer.setName("");
        assertEquals("John", developer.getName());
    }
}
