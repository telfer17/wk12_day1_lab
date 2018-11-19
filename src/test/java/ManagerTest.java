import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static junit.framework.TestCase.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("David", "JH0000", 30000, "CodeClan");
    }

    @Test
    public void hasName(){
        assertEquals("David", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JH0000", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void hasDepartment(){
        assertEquals("CodeClan", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(31000.00, manager.raiseSalary(1000));
    }

    @Test
    public void canRaiseSalary__negativeValueChecker(){
        assertEquals(35000.00, manager.raiseSalary(-5000));
    }

    @Test
    public void canGetBonus(){
        assertEquals(300.00, manager.calculateBonus());
    }

    @Test
    public void canChangeName(){
        manager.setName("Peter");
        assertEquals("Peter", manager.getName());
    }

    @Test
    public void cantChangeName__nullValue(){
        manager.setName("");
        assertEquals("David", manager.getName());
    }


}
