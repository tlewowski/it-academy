package com.company.savory;

import com.company.BigMeal;
import com.company.FoodFactory;
import com.company.Meal;
import com.company.Snack;

public class SavoryFactory implements FoodFactory {
    @Override
    public SavorySnack getSnack() {
        return new SavorySnack();
    }

    @Override
    public SavoryMeal getMeal() {
        return new SavoryMeal();
    }

    @Override
    public SavoryBigMeal getBigMeal() {
        return new SavoryBigMeal();
    }
}
