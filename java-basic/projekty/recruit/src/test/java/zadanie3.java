import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class zadanie3 {

    @Test

    public void test(){
        List<String> lista1 = new ArrayList<>();
        lista1.add("aba");
        lista1.add("aba");
        lista1.add("baca");
        lista1.add("aba");
        int nu = main2.foo(lista1);
        Assert.assertEquals("a",nu);
        //Assert.assertEquals(3, main2.foo2(lista1));

    }
}
