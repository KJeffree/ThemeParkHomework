import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Fluff!", "John", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Fluff!", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("John", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(5, candyFlossStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, candyFlossStall.getRating());
    }

}
