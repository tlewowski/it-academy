package com;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] arg) throws IOException {
        SourceReader src=new SourceReader();
        Path p= Paths.get( "C:\\Users\\itaca\\reporting\\src\\main\\resources\\UserConfig");
        Path p2= Paths.get( "C:\\Users\\itaca\\reporting\\src\\main\\resources\\Source");

        ReportConfigurator reportConfig =new ReportConfigurator();
        Map<String,String> map2=reportConfig.configure(p)
                .makeReport(src.fromCSV(p2));
        ReportPrinter.printReport(map2);

    }
}
