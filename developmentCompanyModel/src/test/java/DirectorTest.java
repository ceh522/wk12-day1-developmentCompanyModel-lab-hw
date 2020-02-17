import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Jane Smith", "JY73900", 60000, "COR", 1000000);
    }

    @Test
    public void hasName(){
        assertEquals("Jane Smith", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("JY73900", director.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(60000, director.getSalary());
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("COR", director.getDepartmentName());
    }

    @Test
    public void hasBudget(){
        assertEquals(1000000, director.getBudget());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(70000, director.getSalary());
    }

    @Test
    public void canPayBonus(){
        assertEquals(600, director.payBonus(), 1e-15);
    }

}



