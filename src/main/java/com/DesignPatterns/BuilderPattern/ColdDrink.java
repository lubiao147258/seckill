package com.DesignPatterns.BuilderPattern;

/**
 * 冷饮
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:17:00
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float Price();
}
