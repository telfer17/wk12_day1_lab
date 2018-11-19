import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static junit.framework.TestCase.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Jack", "AA0000", 28000);
    }

    @Test
    public void hasName(){
        assertEquals("Jack", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("AA0000", databaseAdmin.getNINumber());;
    }

    @Test
    public void hasSalary(){
        assertEquals(28000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(29000.00, databaseAdmin.raiseSalary(1000));
    }

    @Test
    public void canRaiseSalary__negativeValueChecker(){
        assertEquals(30000.00, databaseAdmin.raiseSalary(-2000));
    }

    @Test
    public void canGetBonus(){
        assertEquals(280.00, databaseAdmin.calculateBonus());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Martin");
        assertEquals("Martin", databaseAdmin.getName());
    }

    @Test
    public void cantChangeName__nullValue(){
        databaseAdmin.setName("");
        assertEquals("Jack", databaseAdmin.getName());
    }

}
