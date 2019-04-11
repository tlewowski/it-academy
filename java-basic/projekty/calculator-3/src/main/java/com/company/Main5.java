package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main5 {

    static public void main (String[] args) throws InstantiationException, IllegalAccessException, IOException {

        System.out.println(System.getProperty("user.dir"));
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj sciezke do pliku wejsciowy");
        String w = s.next();
        System.out.println("Podaj sciezke do pliku wyjsciowego");
        String w2 = s.next();
        List<Optional<Node>> In = NodeReader.readNodes(Paths.get(w));
        if (Files.exists(Paths.get(w2)))
        {
            System.out.println("Plik już istnieje czy dalej?");
            boolean a = s.nextBoolean();
            if (!a) System.exit(1);
        }
        PrintStream file2 = new PrintStream(w2);
        for (Optional<Node> d1 : In) {
            if(d1.isPresent())
            {
                file2.print(d1.get().serialize());
                file2.print("=");
                file2.println(d1.get().evaluate());
            }
            else
            {
                file2.println("invalida");
            }
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

