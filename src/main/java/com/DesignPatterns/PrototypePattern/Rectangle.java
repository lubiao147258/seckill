package com.DesignPatterns.PrototypePattern;

/**
 * 创建扩展了Shape抽象类的实体类——三角形类
 * @author lubiao
 * @createDate 2018年07月30日 上午 08:45:00
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "三角形";
    }

    @Override
    void draw() {
        System.out.println("我实现了画三角形的方法！");
    }
}
