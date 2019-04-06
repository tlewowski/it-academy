package com.company.operators;

import com.company.Node;

public class Add extends Operator {
    public Add(Node left, Node right){
        super("+", left, right);
    }
    public double evaluate()
    {
        return left.evaluate()+right.evaluate();
    }
    public Add(){
        super("+");
    }
    public Operator
    makeNew(){
        return new Add();
    }

}
