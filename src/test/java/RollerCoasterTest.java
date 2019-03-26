import Attractions.RollerCoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setup(){
        rollerCoaster = new RollerCoaster();
        visitor = new Visitor(22, 140, 80);
    }

    @Test
    public void hasMinHeight(){
        assertEquals(false, rollerCoaster.minHeight(visitor));
    }
}
