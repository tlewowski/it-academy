import java.util.*;

public class TransactionCountReporter implements Reporter{
    public Map<String, String> makeReport(List<Deal> listDeal) {

        Map<String, String> map1 =  new HashMap<>();
        Set<Integer> ids = new HashSet<>();
        for (Deal d : listDeal)
            ids.add(d.transactionId);
        map1.put("liczba transakcji", Integer.toString(ids.size()));
        return map1;
    }


}
