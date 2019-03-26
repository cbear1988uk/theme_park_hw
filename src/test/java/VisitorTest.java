import org.junit.Before;
import org.junit.Test;
import Visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor1;

    @Before
    public void setup(){
        visitor1 = new Visitor(23, 142, 50);
    }

    @Test
    public void hasAge(){
        assertEquals(23, visitor1.getAge(), 0.01);
    }

    @Test
    public void hasHeight(){
        assertEquals(142, visitor1.getHeight(), 0.01);
    }

    @Test
    public void hasMoney(){
        assertEquals(50, visitor1.getMoney(), 0.01);
    }

}
