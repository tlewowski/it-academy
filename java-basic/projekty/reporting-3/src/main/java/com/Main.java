package com;

import com.reporters.AverageTransactionPrice;
import com.reporters.ProductCountReporter;
import com.reporters.TotalPrice;
import com.reporters.TransactionCountReporter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] arg) throws IOException {


        SourceReader src=new SourceReader();
        Path p= Paths.get( arg[0]);
        List<Reporter> reporters=new ArrayList<>();
        reporters.add(new ProductCountReporter());
        reporters.add(new AverageTransactionPrice());

        CompositeReporter composite= new CompositeReporter(reporters);
        List<Reporter> reporters2=new ArrayList<>();
        reporters2.add(composite);
        reporters2.add(new TransactionCountReporter());
        reporters2.add(new TotalPrice());
        Map<String,String>map2=new CompositeReporter(reporters2)
                .makeReport(src.fromCSV(p));
        ReportPrinter.printReport(map2);
    }
}
