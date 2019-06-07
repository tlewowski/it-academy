package com.reporters;

import com.Deal;
import com.ReportKeys;
import com.Reporter;

import java.util.*;

public class TotalPrice implements Reporter {
    public Map<String, String> makeReport(List<Deal> listDeal) {
        Map<String, String> map1 = new HashMap<>();
        double sum = 0;
        for (Deal d : listDeal) sum = sum + d.price;
        map1.put(ReportKeys.TOTAL_PRICE, Double.toString(sum));
        return map1;
    }
}
