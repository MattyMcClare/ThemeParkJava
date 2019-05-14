import Attraction.Rollercoster;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercosterTest {

    Rollercoster rollercoster;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void before(){
        rollercoster = new Rollercoster(8, "SuperSpeed");
        visitor = new Visitor(18, 180, 50);
        visitor1 = new Visitor(11, 180, 50);
    }

    @Test
    public void hasRating(){
        assertEquals(8, rollercoster.getRating());
    }

    @Test
    public void hasName(){
        assertEquals("SuperSpeed", rollercoster.getName());
    }

    @Test
    public void hasMinAge(){
        assertEquals(12, rollercoster.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(145, rollercoster.getMinHeight());
    }

    @Test
    public void isAllowedToEnterTrue(){
        assertEquals(true, rollercoster.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedToEnterFalse(){
        assertEquals(false, rollercoster.isAllowedTo(visitor1));
    }
}
