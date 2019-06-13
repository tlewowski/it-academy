package com;

import java.util.Map;

public abstract class StructuredReportprinter implements ReportPrinter {


    @Override
    public void printReport(Map<String, String> reports) {
        System.out.println(getProlog());
        for (Map.Entry<String, String> p : reports.entrySet())
            System.out.println(getMetric(p.getKey(),p.getValue()));
        System.out.println(getEpilog());
    }
    protected abstract String getProlog();
    protected abstract String getEpilog();
    protected abstract String getMetric(String key, String value);

}
