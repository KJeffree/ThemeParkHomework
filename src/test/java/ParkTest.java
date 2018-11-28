import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Meadows");
    }

    @Test
    public void canGetName() {
        assertEquals("Meadows", park.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(3, park.getRating());
    }
}
