import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(20, 160, 500);
    }

    @Test
    public void canGetAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(160, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(500, visitor.getMoney());
    }
}
