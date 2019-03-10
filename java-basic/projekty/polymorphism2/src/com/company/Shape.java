package com.company;

abstract public class Shape implements Printable, FlatShape {
    protected double extraStuff() {
        return 0.0;
    }

    public double doubleArea() {
        return 2 * area() + extraStuff();
    }

    public void print() {
        System.out.println(String.format("area: %f, 2x: %f", area(), doubleArea()));
    }
}
