package com.company;

public class Num implements Node {
    double value;

    public Num(double value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.print(value);
    }

    @Override
    public double evaluate() {
        return value;
    }
}
