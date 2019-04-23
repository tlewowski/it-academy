package com.company.sweets;

import com.company.BigMeal;
import com.company.FoodFactory;
import com.company.Meal;
import com.company.Snack;

public class SweetFactory implements FoodFactory {
    @Override
    public SweetSnack getSnack() {
        return new SweetSnack();
    }

    @Override
    public SweetMeal getMeal() {
        return new SweetMeal();
    }

    @Override
    public SweetBigMeal getBigMeal() {
        return new SweetBigMeal();
    }
}
