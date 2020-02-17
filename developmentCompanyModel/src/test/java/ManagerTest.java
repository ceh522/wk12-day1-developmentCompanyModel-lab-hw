import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Julie Smith", "JY47900", 30000, "Helpdesk");
    }

    @Test
    public void hasName(){
        assertEquals("Julie Smith", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JY47900", manager.getNINumber());
    }

    @Test
    public void hasSalary(){
      assertEquals(30000, manager.getSalary());
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Helpdesk", manager.getDepartmentName());
    }


}
