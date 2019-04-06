package com.company;

public class Num extends Node {
    double value;

    public Num(double value) {
        this.value = value;
    }




    public String serialize() {
        return Double.toString(value);
    }


    public double evaluate() {
        return value;
    }
}
