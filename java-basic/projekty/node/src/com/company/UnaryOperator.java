package com.company;

public class UnaryOperator implements Node {
    Node ref;
    String minus="";

    public UnaryOperator(String minus,Node ref) {
        this.minus = minus;
        this.ref = ref;
    }

    @Override
    public void print() {
        System.out.print("("+minus);
        ref.print();
        System.out.print(")");
    }

    @Override
    public double evaluate() {
        return -ref.evaluate();
    }
}
