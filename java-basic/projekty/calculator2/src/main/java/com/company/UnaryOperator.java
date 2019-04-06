package com.company;

public class UnaryOperator extends Node {
    Node ref;
    String minus="";

    public UnaryOperator(String minus,Node ref) {
        this.minus = minus;
        this.ref = ref;
    }



    public String serialize() {
        return ref.serialize();
    }

    @Override
    public double evaluate() {
        return -ref.evaluate();
    }
}
