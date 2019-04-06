package com.company;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NodeReader {
    private static Node readExpresion(InputStream str) throws IllegalAccessException, InstantiationException {

        Scanner s=new Scanner(str);
        //int x= s.nextInt();
        //System.out.println("podales:" +x);
        ArrayList<String> list= new ArrayList<>();
        while(s.hasNext())
        {
            String wejscie = s.next();
            if(wejscie.equals("stop"))
            {
                break;
            }
            else
            {
                String cos = wejscie;
                list.add(cos);
            }

        }
        Parser p = new Parser();
        String[] st={};
        return p.makeTree(list.toArray(st));
    }

    static List<String> readLines(Path path) throws IOException {
        return Files.readAllLines(path);
    }
    static List<Node> readNodes (Path path) throws IOException, InstantiationException, IllegalAccessException {
        List<String> lines = Files.readAllLines(path);
        ArrayList<Node> Nodes = new ArrayList<>();
        for (String s : lines){
            InputStream stream = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
            Nodes.add(readExpresion(stream));
        }
        return Nodes;

    }
}
