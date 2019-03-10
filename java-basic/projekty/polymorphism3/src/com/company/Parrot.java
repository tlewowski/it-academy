package com.company;

public class Parrot extends Bird implements Noisy {
    @Override
    String sound() {
        return "Dej krakersa i " + food();
    }

    @Override
    public void makeNoise() {
        makeSound();
        makeSound();
        makeSound();
    }
}
