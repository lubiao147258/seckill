package com.DesignPatterns.BridgePattern;

/**
 * 创建实现了 Shape 接口的实体类。
 * @author lubiao
 * @createDate 2018年07月30日 上午 11:13:00
 */
public class Circle extends Shape{
    public int x,y,radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
