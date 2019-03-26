import Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void setup(){
        tobaccoStall = new TobaccoStall();
        visitor = new Visitor(20, 139, 45);
    }

    @Test
    public void getMinAge(){
        assertEquals(true, tobaccoStall.minAge(visitor));
    }
}
