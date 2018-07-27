package com.DesignPatterns.BuilderPattern;

/**
 * 鸡肉汉堡
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:22:00
 */
public class ChickenBurger extends Burger{
    public int num;

    public ChickenBurger(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }

    @Override
    public float Price() {
        return 50.0f;
    }

    @Override
    public int number() {
        return num;
    }
}
