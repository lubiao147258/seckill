package com.DesignPatterns.FactoryPattern;

/**
 * 三角形
 * @author lubiao
 * @createDate 2018年07月27日 上午 10:55:00
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("我实现了生产三角形的方法！！");
    }
}
