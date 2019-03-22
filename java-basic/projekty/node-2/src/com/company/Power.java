package com.company;

public class Power extends Operator {

    public Power(Node left, Node right) {
        super("^", left, right);
    }

    @Override
    public double evaluate() {
        return Math.pow(left.evaluate(),right.evaluate());
    }
}
