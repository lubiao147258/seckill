package com.DesignPatterns.DecoratorPattern.Demo1;

/**
 * @author lubiao
 * @createDate 2018年07月31日 上午 08:55:00
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("圆形没有边框");
        circle.draw();

        System.out.println("\n带红边框的圆形");
        redCircle.draw();

        System.out.println("\n带红边框的三角形");
        redRectangle.draw();

    }
}
