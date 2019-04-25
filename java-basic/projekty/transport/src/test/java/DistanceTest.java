import org.junit.Assert;
import org.junit.Test;

public class DistanceTest {
    @Test
    public void TestDistance(){
        Point a = new Point(3,2, "P4");
        Point b = new Point(0,2, "P5");
        Point c = new Point(1, 4, "P6");
        Assert.assertEquals(3, a.odleglosc(b));
        Assert.assertEquals(3,b.odleglosc(a));
        Assert.assertEquals(4,a.odleglosc(c));

    }
}
