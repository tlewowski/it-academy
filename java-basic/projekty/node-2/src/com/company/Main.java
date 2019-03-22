package com.company;

public class Main {

    public static void main(String[] args) {
        Node liczba = new Num(5);
        liczba.print();
        System.out.println("");
        Node wyrazenie = new UnaryOperator("-", liczba);
        wyrazenie.print();
        System.out.println("");
        Node wyrażenie2 = new Add(liczba, wyrazenie);
        wyrażenie2.print();
        System.out.println("");
        System.out.println(liczba.evaluate());
        System.out.println(wyrazenie.evaluate());
        System.out.println(wyrażenie2.evaluate());
        Node duzeWyrazenie = new Add(

                new Add(

                        new Num(2),
                        new Num(3)
                ),
                new Subtract(

                        new Add(
                                new UnaryOperator("-", new Num(7)),
                                new Num (15)),
                        new Num (2)
                )
        );
duzeWyrazenie.print();
System.out.println("");
System.out.println(duzeWyrazenie.evaluate());
    }
}
