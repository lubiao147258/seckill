package com.DesignPatterns.BuilderPattern;

/**
 * 汉堡
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:14:00
 */
public abstract class Burger implements Item{
    @Override
    public Packing packing() {
        return new Wapper();
    }

    @Override
    public abstract float Price();

    @Override
    public abstract int number();
}
