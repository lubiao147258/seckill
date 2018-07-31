package com.DesignPatterns.DecoratorPattern.Demo1;

/**
 * 创建实现了 Shape 接口的抽象装饰类
 * @author lubiao
 * @createDate 2018年07月31日 上午 08:50:00
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
