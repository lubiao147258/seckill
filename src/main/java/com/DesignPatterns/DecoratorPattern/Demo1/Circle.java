package com.DesignPatterns.DecoratorPattern.Demo1;

/**
 * @author lubiao
 * @createDate 2018年07月31日 上午 08:49:00
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("形状：圆形");
    }
}
