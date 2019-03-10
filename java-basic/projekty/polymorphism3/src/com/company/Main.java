package com.company;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeSound();

        Parrot parrot = new Parrot();
        parrot.makeNoise();

        Eater a = new Dog();
        System.out.println(a.food());

        Parrot p = new Parrot();
        Bird b = p;

        b.makeSound();
        Mammal r = new Rabbit();

        r.makeSound();
        Animal t = r;
        a = b;
    }
}
