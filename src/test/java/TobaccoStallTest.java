import Stall.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("BestIceCreamEver", 9, "Stachu", "bestOne");
    }

    @Test
    public void hasName(){
        assertEquals("BestIceCreamEver", tobaccoStall.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(9, tobaccoStall.getRating());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Stachu", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals("bestOne", tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasMinAge(){
        assertEquals(18, tobaccoStall.getMinAge());
    }
}
