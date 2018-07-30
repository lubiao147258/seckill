package com.DesignPatterns.PrototypePattern;

/**
 * 创建扩展了Shape抽象类的实体类——矩形类
 * @author lubiao
 * @createDate 2018年07月30日 上午 08:48:00
 */
public class Square extends Shape{

    public Square() {
        type = "矩形";
    }

    @Override
    void draw() {
        System.out.println("我实现了画矩形的方法！");
    }
}
