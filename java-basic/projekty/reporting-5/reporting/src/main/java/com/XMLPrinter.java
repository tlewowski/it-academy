package com;

public class XMLPrinter extends StructuredReportprinter {
    @Override
    protected String getProlog() {
        String prolog = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?> \n " +
                "<report> \n";
        return prolog;
    }

    @Override
    protected String getEpilog() {
        String epilog =
                "</report>";
        return epilog;
    }

    @Override
    protected String getMetric(String key, String value) {
        String metric="<metric name=\"%s\" value = \"%s\" />";
        return  String.format(metric, sanitize(key), sanitize(value));
    }

    private String sanitize(String s) {
        return s.replaceAll("[^0-9\\w óżźłęąńćśÓŻŹŁĘĄŃĆŚ]","");
    }
}