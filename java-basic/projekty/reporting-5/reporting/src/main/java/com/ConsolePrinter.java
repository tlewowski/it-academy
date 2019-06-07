package com;

import java.util.Map;

public class ConsolePrinter extends StructuredReportprinter {

    @Override
    protected String getProlog() {
        return ("=== RAPORT ===");
    }

    @Override
    protected String getEpilog() {
        return ("=== KONIEC ===");
    }

    @Override
    protected String getMetric(String key, String value) {
        return (String.format("%s: %s", ReportKeyTranslator.translate(key), value));
    }
}
