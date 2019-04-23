package com.company;

import com.company.sweets.SweetFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(12);
        System.out.println(list);
        ArrayUtils.modifier(list,new AddFive());
        System.out.println(list);
    }
}
