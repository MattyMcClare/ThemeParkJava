import Attraction.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems(8, "SuperSpeed");
    }

    @Test
    public void hasRating(){
        assertEquals(8, dodgems.getRating());
    }

    @Test
    public void hasName(){
        assertEquals("SuperSpeed", dodgems.getName());
    }
}
