import Stall.TobaccoStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;
    Visitor visitor1;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("BestIceCreamEver", 9, "Stachu", "bestOne");
        visitor = new Visitor(18, 180, 50);
        visitor1 = new Visitor(11, 180, 50);
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

    @Test
    public void isAllowedToEnterTrue(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void isAllowedToEnterFalse(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }
}
