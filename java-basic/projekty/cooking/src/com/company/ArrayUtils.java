package com.company;

import java.util.ArrayList;

public class ArrayUtils {

    public static void modifier(ArrayList<Integer> list,ModifierStrategy s)
    {
    for(int i=0;i<list.size();i++)
    {
        list.set(i,s.modify(list.get(i)));
    }
    }
}
