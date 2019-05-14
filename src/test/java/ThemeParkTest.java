import Attraction.Playground;
import Attraction.Rollercoster;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Playground playground;
    Rollercoster rollercoster;

    @Before
    public void before(){
        themePark = new ThemePark("GhostPark");
        playground = new Playground(8, "MegaFun");
        rollercoster = new Rollercoster(8, "SuperSpeed");
    }

    @Test
    public void hasName(){
        assertEquals("GhostPark", themePark.getName());
    }

    @Test
    public void allReviewedStartEmpty(){
        assertEquals(0, themePark.reviewsCount());
    }

    @Test
    public void canAddReview(){
        themePark.addReview(playground);
        assertEquals(1, themePark.reviewsCount());
    }


}
