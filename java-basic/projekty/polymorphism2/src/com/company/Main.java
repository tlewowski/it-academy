package com.company;

public class Main {

    public static void main(String[] args) {
        Shape sq = new Square(10);
        Order ord = new Order("Jakieś zamówienie");

        System.out.println(sq.area());
        System.out.println(sq.doubleArea());

        FlatShape fs = sq;
        System.out.println(fs.area());
        fs = new WeirdShape();
        System.out.println(fs.area());
        Printer.printStuff(sq);
        Printer.printStuff(ord);

        // write your code here
    }
}
