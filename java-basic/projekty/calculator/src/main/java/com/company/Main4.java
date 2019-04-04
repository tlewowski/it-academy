package com.company;

public class Main4 {
    static public void main (String[] args) throws InstantiationException, IllegalAccessException {
        String[] tablica2 = {"+","5","+","23","+","6","5"};
        Parser s = new Parser();

        s.makeTree(tablica2).print();
        }
    }

