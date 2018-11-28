import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest{

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("I Scream You Scream", "Sara", 6);
    }

    @Test
    public void canGetName(){
        assertEquals("I Scream You Scream", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Sara", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(6, iceCreamStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(5, iceCreamStall.getRating());
    }
}
