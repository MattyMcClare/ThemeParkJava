import Attraction.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground(8, "MegaFun");
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
}
