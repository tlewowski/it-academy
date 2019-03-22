package com.company;

abstract class Operator implements Node {
String symbol;
    Node left,right;
public Operator (String symbol,Node left, Node right) {
            this.left = left;
            this.right = right;
            this.symbol=symbol;
}

    protected boolean requiresBrackets()
    {
        return true;
    }
    public void print() {
    if(requiresBrackets()) {
        System.out.print("(");
        printCore();
        System.out.print(")");
         }
         else
    {
        printCore();
    }
    }

    private void printCore() {
        left.print();
        System.out.print(symbol);
        right.print();
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
