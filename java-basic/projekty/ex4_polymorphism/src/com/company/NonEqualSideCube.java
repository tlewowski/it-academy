package com.company;

public class NonEqualSideCube extends Cube {
    double side2;
    double side3;
    NonEqualSideCube(double side1, double side2, double side3, double density) {
        super(side1, density);
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getVolume() {
        return side * side2 * side3;
    }
}
