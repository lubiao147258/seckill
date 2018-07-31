package com.DesignPatterns.DecoratorPattern.Demo1;

/**
 * @author lubiao
 * @createDate 2018年07月31日 上午 08:52:00
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("边框颜色：红色");
    }
}
