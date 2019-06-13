package com;

import com.reporters.SQLLoader;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Main4 {

    public static void main(String[] arg) throws Exception {
        DBReader r = new DBReader();
        List<Deal> deals = r.get(Deal.class);
        for (Deal deal2 : deals){
            System.out.println(deal2);
        }
    }
}
