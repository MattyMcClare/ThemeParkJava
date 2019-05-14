import Attraction.Playground;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void before(){
        playground = new Playground(8, "MegaFun");
        visitor = new Visitor(18, 180, 50);
        visitor1 = new Visitor(11, 180, 50);
    }

    @Test
    public void hasRating(){
        assertEquals(8, playground.getRating());
    }

    @Test
    public void hasName(){
        assertEquals("MegaFun", playground.getName());
    }

    @Test
    public void hasMinAge(){
        assertEquals(15, playground.getMinAge());
    }

    @Test
    public void isAllowedToEnterTrue(){
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedToEnterFalse(){
        assertEquals(false, playground.isAllowedTo(visitor1));
    }
}
