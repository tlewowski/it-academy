package com.company;

public class Add extends Operator {
    public Add(Node left, Node right){
        super("+", left, right);
    }
    public double evaluate()
    {
        return left.evaluate()+right.evaluate();
    }

}
