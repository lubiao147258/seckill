package com.DesignPatterns.PrototypePattern;

/**
 * 创建扩展了Shape抽象类的实体类——圆形类
 * @author lubiao
 * @createDate 2018年07月30日 上午 08:48:00
 */
public class Circle extends Shape{

    public Circle() {
        type = "圆形";
    }

    @Override
    void draw() {
        System.out.println("我实现了画圆形的方法！");
    }
}
