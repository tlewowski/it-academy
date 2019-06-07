package com;

import com.reporters.SQLLoader;

import javax.swing.text.html.HTML;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.Map;

public class Main3 {

    public static void main(String[] arg) throws IOException, SQLException {
        SQLLoader src=new SQLLoader();
        Path p= Paths.get( "C:\\Users\\itaca\\reporting\\src\\main\\resources\\UserConfig");
        Path p2= Paths.get( "C:\\Users\\itaca\\reporting\\src\\main\\resources\\Source");

        ReportConfigurator reportConfig =new ReportConfigurator();
        try
        {
            Map<String, String> map2 = reportConfig.configure(p)
                    .makeReport(src.fromDB());
            OutputStream f = Files.newOutputStream(Paths.get("C:\\Users\\itaca\\reporting\\src\\main\\resources\\index.xml"));
            System.setOut(new PrintStream(f));
            new XMLPrinter().printReport(map2);
        }
        catch (org.postgresql.util.PSQLException e)
        {
            System.err.println("Cos sie rozłączyło :( \n" +e);
        }
    }
}
