package com.company.operators;

import com.company.Node;

abstract public class Operator implements Node {
String symbol;
    Node left,right;
public Operator (String symbol,Node left, Node right) {
            this.left = left;
            this.right = right;
            this.symbol=symbol;
}
public Operator(String symbol){
    this.symbol = symbol;
}
public String getSymbol()
{
   return symbol;
}
public abstract Operator
    makeNew();

/*public Operator makeCopy() throws java.lang.IllegalAccessException, java.lang.InstantiationException
{
    Operator op = this.getClass().newInstance();
    return op;
}
*/


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

    public void setLeft(Node left)
    {
       this.left = left;
    }
    public void setRigth(Node right)
    {
        this.right = right;
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
