package com.company;

public class Dog extends Mammal {
    @Override
    String sound() {
        return "Woof";
    }

    @Override
    public String food() {
        return "kości";
    }
}
