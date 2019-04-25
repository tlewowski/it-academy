import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProximitTest {
    @Test
    public void proximit()
    {
        Point a = new Point(4,3, "P1");
        Point b = new Point(2,5, "P2");
        Point c = new Point(0, 3, "P3");

        Point d = new Point(6,10, "P4");
        Point e = new Point(0,100, "P5");
        //podany przez użytkownika F
        Point f = new Point(4, 10, "P6");
        List<Point> list = new ArrayList<Point>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        Assert.assertEquals(f.closest(list), 4);
    }
}
