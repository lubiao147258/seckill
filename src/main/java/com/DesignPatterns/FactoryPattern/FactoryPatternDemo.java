package com.DesignPatterns.FactoryPattern;

/**
 * 使用工厂
 * @author lubiao
 * @createDate 2018年07月27日 上午 11:00:00
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //生产一个圆形
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        //生产一个三角形
        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        //生产一个矩形
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
    }


}
