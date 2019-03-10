package com.company;

public class Circle extends Shape implements ICircle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public double myRadius() {
        return radius;
    }
}
