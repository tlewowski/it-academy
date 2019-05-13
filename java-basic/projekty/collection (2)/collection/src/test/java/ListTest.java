import org.junit.Assert;
import org.junit.Test;
import sun.awt.image.IntegerInterleavedRaster;

public class ListTest {
    @Test
    public void StringListPossible ()
    {
        MyList<String, RuntimeException> l = new MyList<>("abc", null, new RuntimeException());
        System.out.println(l.map(x->x.toUpperCase()).getHead());
        System.out.println(l.map(x -> x.length()).getHead());
        // MyList<Integer> i = new MyList<>(new Integer(2), null);
    }
@Test public void FilterTest(){
    MyList<String, Exception> ml = new MyList<>("a", null, new Exception())
            .prepend("sa").prepend("dsdsdsd");
    Assert.assertEquals(3, ml.size());
    Assert.assertEquals(1, ml.filter(x->x.length()>2).size());

    }
    @Test
    public void FoldTest()
    {
        MyList<String, Exception> ml = new MyList<>("2", null, new Exception())
                .prepend("3").prepend("4").prepend("5").prepend("abc");
        MyList<Integer, Exception> m2 = new MyList<>(2, null, new Exception())
                .prepend(3);
        Assert.assertEquals(
                5,
                m2.fold(0, (a,b)->a+b).intValue()
        );
    }
}
