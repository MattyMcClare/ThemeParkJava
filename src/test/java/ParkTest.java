import Attraction.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park(8, "ExtraRelax");
    }

    @Test
    public void hasRating(){
        assertEquals(8, park.getRating());
    }

    @Test
    public void hasName(){
        assertEquals("ExtraRelax", park.getName());
    }
}
