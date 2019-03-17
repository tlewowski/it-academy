package com.company;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(10);

        try {
            a.get(10);
            System.out.println("Element found!");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Finishing");
    }
}