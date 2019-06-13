package com;

public class HTMLPrinter extends StructuredReportprinter {

    @Override
    protected String getProlog() {
        String prolog = "<!DOCTYPE html> \n " +
                "<html> \n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "</head>"+
                "<body>\n" +
                "<div>";
        return prolog;
    }

    @Override
    protected String getEpilog() {
        String epilog =
                "</div>" +
                        "</body>\n" +
                        "</html> \n";
        return epilog;
    }

    @Override
    protected String getMetric(String key, String value) {
        String metric="<strong>%s</strong>:%s<br />";
        return  String.format(metric, ReportKeyTranslator.translate(key), value);
    }
}
