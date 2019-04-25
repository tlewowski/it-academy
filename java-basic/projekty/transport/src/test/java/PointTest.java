import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void pointMakingTest()
    {
        Point p = null;
        Point a = new Point(3,5, "P2");
        Assert.assertEquals(a.getX(),3);
        Assert.assertEquals(a.getY(),5);
        Assert.assertEquals(a.getName(),"P2");

        Point b = new Point(6, 4, "P3");
        Assert.assertEquals(b.getX(),6);
        Assert.assertEquals(b.getY(),4);
        Assert.assertEquals(b.getName(),"P3");

        Point c = new Point("P3 7 2");
        Assert.assertEquals(c.getName(),"P3");

        Assert.assertEquals(c.getX(),7);
        Assert.assertEquals(c.getY(),2);






    }
}
