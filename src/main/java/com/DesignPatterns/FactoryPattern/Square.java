package com.DesignPatterns.FactoryPattern;

/**
 *矩形
 * @author lubiao
 * @createDate 2018年07月27日 上午 10:55:00
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("我实现了生产矩形的方法！！");
    }
}
