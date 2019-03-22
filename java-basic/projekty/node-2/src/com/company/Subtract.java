package com.company;

public class Subtract extends Operator {
    public Subtract(Node left, Node right){
        super("-", left, right);
    }
    public double evaluate()
    {
        return left.evaluate()-right.evaluate();
    }
}
