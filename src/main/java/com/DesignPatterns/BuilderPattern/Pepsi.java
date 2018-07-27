package com.DesignPatterns.BuilderPattern;

/**
 * 百事可乐
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:26:00
 */
public class Pepsi extends ColdDrink {

    public int num;

    public Pepsi(int num) {
        this.num = num;
    }

    @Override
    public String name() {
        return "百事可乐";
    }

    @Override
    public int number() {
        return num;
    }

    @Override
    public float Price() {
        return 4.5f;
    }
}
