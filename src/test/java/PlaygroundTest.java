import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Mad House");
        visitor1 = new Visitor(20, 160, 200);
        visitor2 = new Visitor(10, 100, 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Mad House", playground.getName());
    }

    @Test
    public void canGoIntoPlaygroundIfUnder15(){
        assertEquals(true, playground.isAllowedTo(visitor2));
    }

    @Test
    public void cannotGoIntoPlaygroundIfOver15(){
        assertEquals(false, playground.isAllowedTo(visitor1));
    }

    @Test
    public void canGetRating(){
        assertEquals(4, playground.getRating());
    }
}
