import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {
    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tobacco", "Milly", 2);
        visitor1 = new Visitor(20, 160, 200);
        visitor2 = new Visitor(10, 100, 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Tobacco", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Milly", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(2, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canBuyTobaccoIfOver18(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void cannotBuyTobaccoIfUnder18(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void canGetRating(){
        assertEquals(3, tobaccoStall.getRating());
    }

}
