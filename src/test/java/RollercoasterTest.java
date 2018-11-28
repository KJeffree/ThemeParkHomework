import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Drop");
        visitor1 = new Visitor(20, 160, 200);
        visitor2 = new Visitor(10, 100, 10);
    }

    @Test
    public void canGetName() {
        assertEquals("The Drop", rollercoaster.getName());
    }

    @Test
    public void canRideRollerCoasterIfOver145cm(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void cannotRideRollerCoasterIfUnder145cm(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating(){
        assertEquals(5, rollercoaster.getRating());
    }
}
