package com.DesignPatterns.BuilderPattern;

/**
 * 建造者模式
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:37:00
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal(3,5);
        System.out.println("素食");
        vegMeal.showItems();
        System.out.println("合计: " +vegMeal.getCost() +"￥");

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal(2,1);
        System.out.println("\n\n肉食");
        nonVegMeal.showItems();
        System.out.println("合计: " +nonVegMeal.getCost() +"￥");
    }
}
