import Stall.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("BestIceCreamEver", 9, "Stachu", "bestOne");
    }

    @Test
    public void hasName(){
        assertEquals("BestIceCreamEver", candyFlossStall.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(9, candyFlossStall.getRating());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Stachu", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("bestOne", candyFlossStall.getParkingSpot());
    }
}
