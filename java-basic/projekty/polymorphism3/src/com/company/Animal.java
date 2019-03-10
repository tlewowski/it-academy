package com.company;

abstract public class Animal implements Eater {
    String sound() {
        return "";
    }

    public void makeSound() {
        System.out.println(sound());
    }
}
