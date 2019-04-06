package com.company.operators;

import com.company.Node;

abstract public class Operator extends Node {
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

    public String serialize() {
        return "("+serializeCore()+")";
    }
    protected boolean requiresBrackets()
    {
        return true;
    }
    public void print() {
    if(requiresBrackets()) {

        System.out.println(serialize());
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
    private String serializeCore()
    {
       return left.serialize()+symbol+right.serialize();

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
