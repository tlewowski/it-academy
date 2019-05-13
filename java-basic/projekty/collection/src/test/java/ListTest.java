import org.junit.Test;
import sun.awt.image.IntegerInterleavedRaster;

public class ListTest {
    @Test
    public void StringListPossible ()
    {
        MyList<String, RuntimeException> l = new MyList<>("abc", null, new RuntimeException());
       l.map(x->x.toUpperCase());
        System.out.println(l.map(x->x.toUpperCase()).getHead());
        // MyList<Integer> i = new MyList<>(new Integer(2), null);
    }

}
