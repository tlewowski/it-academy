package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Printer {
    static void printStuff(Printable printable) {
        System.out.println("============");
        printable.print();
        System.out.println("============");
    }
}
