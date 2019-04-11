package com.company;

public abstract class Node {
    public void print() {
          System.out.println(serialize());
     }

   public   abstract String serialize();
     public abstract double evaluate();


}
