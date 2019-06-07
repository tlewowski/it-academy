package com;

import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class Main2 {

    public static void main(String[] arg) throws IOException {
        SourceReader src=new SourceReader();
        Path p= Paths.get( "C:\\Users\\itaca\\reporting\\src\\main\\resources\\UserConfig");
        Path p2= Paths.get( "C:\\Users\\itaca\\reporting\\src\\main\\resources\\Source");

        ReportConfigurator reportConfig =new ReportConfigurator();
        Map<String,String> map2=reportConfig.configure(p)
                .makeReport(src.fromCSV(p2));
        OutputStream f= Files.newOutputStream(Paths.get("C:\\Users\\itaca\\reporting\\src\\main\\resources\\index.xml"));
        System.setOut(new PrintStream(f));
        new XMLPrinter().printReport(map2);

    }
}
