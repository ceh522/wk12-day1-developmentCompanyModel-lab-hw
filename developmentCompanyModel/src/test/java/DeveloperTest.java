import org.junit.Before;
import org.junit.Test;
import staff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Lucy", "YN76480", 29000);
    }

    @Test
    public void hasName(){
        assertEquals("Lucy", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("YN76480", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(29000, developer.getSalary());
    }

}
