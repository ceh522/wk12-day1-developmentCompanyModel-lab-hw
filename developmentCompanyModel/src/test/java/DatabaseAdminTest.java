import org.junit.Before;
import org.junit.Test;
import staff.DatabaseAdmin;
import staff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Sarah", "GN76480", 18000);
    }

    @Test
    public void hasName(){
        assertEquals("Sarah", databaseAdmin.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("GN76480", databaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(18000, databaseAdmin.getSalary());
    }
}
