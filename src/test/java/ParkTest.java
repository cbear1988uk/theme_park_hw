import Attractions.Park;
import Behaviours.ISecurity;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;
    Visitor visitor;

    @Before
    public void before(){
        park = new Park();
        visitor = new Visitor(15, 148, 20);
    }

    @Test
    public void getMaxAge(){
        assertEquals(true, park.maxAge(visitor));
    }
}
