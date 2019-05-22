import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DealTest {
    @Test
    public void test1() {
        Deal d = new Deal(1, 654654, 50.00, 0.23);
        Assert.assertEquals(1, d.id);
        Assert.assertEquals(654654, d.transactionId);
        Assert.assertEquals(50.00, d.price, 1e-5);
        Assert.assertEquals(0.23, d.tax, 1e-5);
    }
        @Test
    public void test2() {
            List<Deal> listDeal = new ArrayList<>();
            listDeal.add(new Deal(1, 2, 100, 0.1));
            listDeal.add(new Deal(1, 3, 100, 0.2));
            listDeal.add(new Deal(2, 4, 100, 0.2));


            Map<String, String> map2 = new Reporter().makeReport(listDeal);
            Assert.assertEquals(map2.get("liczba transakcji"), "3");

        }
    @Test
    public void test3() throws URISyntaxException, IOException {

        SourceReader src=new SourceReader();
        Path p=Paths.get( (getClass().getClassLoader()
                .getResource("Source").toURI()));


        Map<String, String> map2 = new Reporter().makeReport(src.fromCSV(p));
        Assert.assertEquals(map2.get("liczba transakcji"), "3");

    }

    }


