package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main2 {
    static public void main(String[] args) throws IOException {
       String s = Files.lines(Paths.get("C:\\Users\\itaca\\cooking\\src\\file.csv"))
               .map(c->
                       c.substring(0, 1)
                               .toUpperCase() +
                               c.substring(1, c.length()))
               .collect(Collectors.joining("\n"));
       Files.write(Paths.get("out.csv"), s.getBytes());

    }

}
