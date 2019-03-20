package com.company;

public class Operator implements Node {
String symbol;
    Node left,right;
public Operator (String symbol,Node left, Node right){
    this.left = left;
            this.right = right;
            this.symbol = symbol;
}
    @Override
    public void print() {
    left.print();
    System.out.print(symbol);
    right.print();


    }

    @Override
    public double evaluate() {
    if (symbol.equals("+"))
        return left.evaluate()+right.evaluate();
    else
        return left.evaluate()-right.evaluate();
    }

    private double evaluate2() {
      double lValue = left.evaluate();
      double rValue = right.evaluate();
      if(symbol.equals("+"))
          return lValue + rValue;
      else
          return lValue - rValue;
    }
}
