package com.company;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Map<String, Item> namedItems = new HashMap<>();
        Set<String> names = new HashSet<>();

        for(int i = 0; i < 500; ++i) {
            String name = "kostka" + String.format("%d", i);
            Cube cube = new Cube(
                    Math.abs(Math.random()),
                    Math.abs(Math.random())
            );

            names.add(name + "1");
            items.add(cube);
            namedItems.put(name, cube);
            names.add(name);
        }

        System.out.println(items.size());
        System.out.println(namedItems.size());
        System.out.println(names.size());


        double totalMass = 0;
        for(Item c : items) {
            totalMass += c.getWeight();
        }

        System.out.println(totalMass);
//        System.out.println(items.get(1000));
        System.out.println(namedItems.get("kosta1"));
        System.out.println(namedItems.getOrDefault("kosta1", new Cube(1, 1)));

	// write your code here
    }
}
