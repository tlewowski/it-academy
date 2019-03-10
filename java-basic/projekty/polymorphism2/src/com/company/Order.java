package com.company;

public class Order implements Printable {
    String text;
    Order(String t) {
        text = t;
    }

    @Override
    public void print() {
        System.out.println(text);
    }
}
