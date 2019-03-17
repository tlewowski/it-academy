package com.company;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        Map<String, String> ulubioneKolory = new HashMap<>();
        ulubioneKolory.put("Stefan", "niebieski");
        ulubioneKolory.put("Ania", "zielony");
        ulubioneKolory.put("Jan", "zielony");

        for(Map.Entry<String, String> a: ulubioneKolory.entrySet()) {
            System.out.println(String.format("%s -> %s", a.getKey(), a.getValue()));
        }

        for(String v : ulubioneKolory.values()) {
            System.out.println(v);
        }
        for(String v : ulubioneKolory.keySet()) {
            System.out.println(v);
            System.out.println(ulubioneKolory.get(v));
        }

        ulubioneKolory.remove("Ania-x");
        ulubioneKolory.putIfAbsent("Ania", "żółty");
        ulubioneKolory.putIfAbsent("Henryk", "żółty");
        for(Map.Entry<String, String> a: ulubioneKolory.entrySet()) {
            System.out.println(String.format("%s -> %s", a.getKey(), a.getValue()));
        }

        System.out.println(ulubioneKolory.get(new Object()));
    }
}