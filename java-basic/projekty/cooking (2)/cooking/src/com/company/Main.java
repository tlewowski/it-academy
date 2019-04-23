package com.company;

import com.company.sweets.SweetFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface Interface {
    Integer f(Integer a, Integer b);
}

public class Main {

    public static void main(String[] args) {
        Interface inter = (Integer a, Integer b) -> a + b;
        Interface inter2 = (a, b) -> a + b;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        list.add(1);
        list.add(14);
        list.add(2);
        list.add(20);
        list.add(5);
        list.add(1);
        list.add(50);
        list.add(3);

       // System.out.println(list);
        ArrayUtils.modifier(list,new AddFive());
        ArrayUtils.modifier(list, n -> n + 5);
        ArrayUtils.modifier(list, n -> n + 5);
       // System.out.println(list);

       Stream<Integer> stream= list.stream()
               .map(n->n*5).filter(n->n%1==0)
               ;
       Stream<Integer> stream4 = stream.sorted().distinct();

        //Stream<Integer> stream2 = stream.map(n->n+12);
        //Stream<Integer> stream3 = stream2.map(n->n*20);
       System.out.println(list);
      // System.out.println(stream.collect(Collectors.toList()));
       System.out.println(stream4.collect(Collectors.toList()));

    }
}
