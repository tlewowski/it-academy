package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main5 {

    static public void main (String[] args) throws InstantiationException, IllegalAccessException, IOException {
        System.out.println("podaj wyrazenie jak zakonczyc wpisz stop");
        Node d = readExpresion(System.in);
        System.out.println(d.serialize());
        System.out.println(d.evaluate());

        List<Node> In = NodeReader.readNodes(Paths.get("C:\\Users\\itaca\\calculator\\" +
        "src\\main\\resources\\example_nodes"));
        for (Node d1 : In) {
            System.out.println(d1.serialize());
            System.out.println(d1.evaluate());
        }
    }

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
}

