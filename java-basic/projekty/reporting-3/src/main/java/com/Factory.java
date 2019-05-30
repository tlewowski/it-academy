package com;

import com.reporters.AverageTransactionPrice;
import com.reporters.ProductCountReporter;
import com.reporters.TotalPrice;
import com.reporters.TransactionCountReporter;

import java.util.HashMap;
import java.util.Map;

public class Factory {
    static private Factory f;
    private Map<String,Reporter> map1 = new HashMap<>();
    private Factory(){
        map1.put("x", new AverageTransactionPrice());
        map1.put("y", new TotalPrice());
        map1.put("z", new TransactionCountReporter());
        map1.put("b", new ProductCountReporter());
    }
    public Reporter createReporter(String s) {
        return map1.get(s.trim());
    }
    public static Factory getInstance()
    {
        if(f==null) f=new Factory();x
        return f;
    }
}

