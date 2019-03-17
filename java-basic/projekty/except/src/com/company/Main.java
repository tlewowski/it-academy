package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[1] = 1;

        ArrayList<Integer> g = new ArrayList<>();
        g.add(32);
        g.add(10);
        g.add(15);

        System.out.println("BEFORE");
        for(Integer s: g) {
            System.out.println(s);
        }

        g.sort(null);
        System.out.println("AFTER");
        for(int i = 0; i < g.size(); ++i) {
            System.out.println(g.get(i));
        }

        for(Iterator<Integer> i = g.iterator(); i.hasNext(); ) {
            System.out.println(i.next());
        }

	// write your code here
    }
}
