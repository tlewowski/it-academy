package com.company;

import com.company.operators.Add;
import com.company.operators.Multiply;
import com.company.operators.Power;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Dowolny tekst");
        Node wyrazenie = new Multiply(
                new Num (5),
                new Add(
                new Num (2),
                        new Num (4)));
        wyrazenie.print();
        System.out.println("");
        System.out.println(wyrazenie.evaluate());
        try
        {
            Node wyrazenie2 = new Power(
                    new Num (5),
                    new Add (
                            new Num (2),
                            new Num (4)));
            wyrazenie2.print();
            System.out.println("");
            System.out.println(wyrazenie2.evaluate());
        }
        catch (RuntimeException e)
        {
            System.out.println("dzien dobry tutaj throw"+e);
        }

        Node wyrazenie3 = new Multiply(
                new Num (5),
                new Add (
                        new Num (2),
                        new Num (4)));
        wyrazenie3.print();
        System.out.println("");
        System.out.println(wyrazenie3.evaluate());


}}
