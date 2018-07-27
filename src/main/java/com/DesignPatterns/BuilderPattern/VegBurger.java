package com.DesignPatterns.BuilderPattern;

/**
 * 素食汉堡
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:19:00
 */
public class VegBurger extends  Burger {
    public int num;

    public VegBurger(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "素食汉堡";
    }

    @Override
    public float Price() {
        return 25.0f;
    }

    @Override
    public int number() {
        return num;
    }

}
