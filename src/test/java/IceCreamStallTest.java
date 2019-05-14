import Stall.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("BestIceCreamEver", 9, "Stachu", "bestOne");
    }

    @Test
    public void hasName(){
        assertEquals("BestIceCreamEver", iceCreamStall.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(9, iceCreamStall.getRating());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Stachu", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("bestOne", iceCreamStall.getParkingSpot());
    }
}
