import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Bumpers!");
    }

    @Test
    public void canGetName(){
        assertEquals("Bumpers!", dodgems.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(3, dodgems.getRating());
    }
}
