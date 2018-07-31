package com.DesignPatterns.DecoratorPattern.Demo1;

/**
 * @author lubiao
 * @createDate 2018年07月31日 上午 08:48:00
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("形状：三角形");
    }
}
