package com.reporters;

import com.Deal;
import com.Reporter;

import java.util.*;

public class ProductCountReporter implements Reporter {

    @Override
    public Map<String, String> makeReport(List<Deal> listDeal) {
        Map<String, String> map1 =  new HashMap<>();
        Set<Integer> ids = new HashSet<>();
        for (Deal d : listDeal)
            ids.add(d.did);
        map1.put("liczba produktów", Integer.toString(ids.size()));
        return map1;
    }

}
