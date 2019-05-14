import Attraction.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercosterTest {

    Rollercoster rollercoster;

    @Before
    public void before(){
        rollercoster = new Rollercoster(8, "SuperSpeed");
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
}
