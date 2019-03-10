package com.company;

public class Square extends Shape {
    Square(double s) {
        side = s;
    }
    double side;

    @Override
    public double area() {
        return side * side;
    }

    @Override
    protected double extraStuff() {
        return 1.0;
    }
}
