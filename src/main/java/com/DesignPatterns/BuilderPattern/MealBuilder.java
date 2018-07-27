package com.DesignPatterns.BuilderPattern;

/**
 * 创建Meal对象
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:33:00
 */
public class MealBuilder {
    public Meal prepareVegMeal (int burgerNum,int drinkNum){
        Meal meal = new Meal();
        meal.addItem(new VegBurger(burgerNum));
        meal.addItem(new Coke(drinkNum));
        return meal;
    }

    public Meal prepareNonVegMeal (int burgerNum,int drinkNum){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger(burgerNum));
        meal.addItem(new Pepsi(drinkNum));
        return meal;
    }
}
