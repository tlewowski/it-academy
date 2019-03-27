package com.company.operators;

import com.company.Node;

public class Subtract extends Operator {
    public Subtract(Node left, Node right){
        super("-", left, right);
    }
    public double evaluate()
    {
        return left.evaluate()-right.evaluate();
    }
}
