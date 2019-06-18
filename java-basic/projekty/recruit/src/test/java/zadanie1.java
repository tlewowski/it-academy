import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

public class zadanie1 {
    @Test
    public void test()
    {

        int[] tab = {1,2,5,7,-10,13};
        Pair<Integer, Integer> result = main.f(tab);
        Assert.assertEquals(7, result.getKey().longValue());
        Assert.assertEquals(-10, result.getValue().longValue());
    }
    @Test
    public void test2()
    {

        int[] tab = {1,2};
        Pair<Integer, Integer> result = main.f(tab);
        Assert.assertEquals(1, result.getKey().longValue());
        Assert.assertEquals(2, result.getValue().longValue());
    }
    @Test
    public void test3()
    {

        int[] tab = {1};
        Pair<Integer, Integer> result = main.f(tab);
        Assert.assertNull(result);
    }



}
