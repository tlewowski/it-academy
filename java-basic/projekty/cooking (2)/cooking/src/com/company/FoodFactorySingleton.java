package com.company;

public class FoodFactorySingleton {
    private static FoodFactory s;

    private FoodFactorySingleton() {
    }
    public static void setInstance(FoodFactory F){
        s = F;
    }
    public static FoodFactory getInstance() {
       return s;
    }
}