package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Map<String, Item> namedItems = new HashMap<>();

        String name = "kostka1";
        Item cube = new Cube(1, 10);
        items.add(cube);
        namedItems.put(name, cube);
        String name2 = "kostka2";
        Item cube1 = new Cube(1, 10);
        items.add(cube1);
        namedItems.put(name2, cube1);
        String name3 = "kostka3";
        Item cube2 = new Cube(1, 1);
        namedItems.put(name3, cube2);

        items.add(cube2);
        Item nonEqualCube = new NonEqualSideCube(1, 5, 4, 10);

        System.out.println(namedItems.size());
        if(namedItems.containsKey("123")) {
            System.out.println("JEST");
        } else {
            System.out.println("NIE MA");
        }


	// write your code here
    }
}
