package com.DesignPatterns.BuilderPattern;

/**
 * 食物条目接口
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:03:00
 */
public interface Item {
    public String name();
    public Packing packing();
    public int number();
    public float Price();
}
