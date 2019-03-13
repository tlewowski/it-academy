package com.company;

public class Cube implements Item {
    double side;
    double density;

    Cube(double side, double density) {
        this.side = side;
        this.density = density;
    }

    @Override
    public double getWeight() {
        return getVolume() * density;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }

    @Override
    public boolean equals(Object obj) {
        Cube c = (Cube)obj;
        if(c == null) {
            return false;
        }

        return c.side == side && c.density == density;
    }
}
