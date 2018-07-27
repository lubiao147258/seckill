package com.DesignPatterns.FactoryPattern;

/**
 * 圆形
 * @author lubiao
 * @createDate 2018年07月27日 上午 10:56:00
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("我实现了生产圆形的方法！！");
    }
}
