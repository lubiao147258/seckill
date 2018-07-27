package com.DesignPatterns.BuilderPattern;

/**
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:12:00
 */
public class Bottle implements Packing {
    @Override
    public String Pack() {
        return "瓶装";
    }
}
