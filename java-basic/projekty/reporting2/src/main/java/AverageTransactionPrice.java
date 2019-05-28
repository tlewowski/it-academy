import java.util.*;

public class AverageTransactionPrice implements Reporter {

    public Map<String, String> makeReport(List<Deal> listDeal) {
        Map<String, String> map1 =  new HashMap<>();
        double avgPrice=0;
        double sum = 0;
        Set<Integer> ids = new HashSet<>();
        for (Deal d : listDeal)
        {
            sum = sum + d.price;
            ids.add(d.transactionId);
        }
        avgPrice=sum/ids.size();

        map1.put("średnia kwota transakcji", Double.toString(avgPrice));
        return map1;
    }
}
