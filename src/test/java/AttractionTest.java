import Attraction.Rollercoster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AttractionTest {

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
}
