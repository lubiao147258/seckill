package com.DesignPatterns.BuilderPattern;

/**
 * 可口可乐
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:24:00
 */
public class Coke extends ColdDrink {
    public int num;

    public Coke(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "可口可乐";
    }

    @Override
    public int number() {
        return num;
    }

    @Override
    public float Price() {
        return 3.5f;
    }
}
