package com.company.operators;

import com.company.Node;

public class Multiply extends Operator {
    public Multiply(Node left, Node right){
        super("*", left, right);
    }
    public double evaluate()
    {
        return left.evaluate()*right.evaluate();
    }
    protected boolean requiresBrackets()
    {
        return false;
    }

    public Multiply(){
        super("*");
    }public Operator
    makeNew(){
        return new Multiply();
    }
}
