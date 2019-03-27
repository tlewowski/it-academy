package com.company;

public class Main3 {
    public static void main(String[] args) {
        String[] tablica = {"5"};
        String[] tablica2 = {"+","5","3"};
        String[] tablica3 = {"+","7","+","7"};
        Parser s = new Parser();

        s.makeTree(tablica3).print();
    }

}