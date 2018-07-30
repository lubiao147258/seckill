package com.DesignPatterns.BridgePattern;

/**
 * 使用 DrawAPI 接口创建抽象类 Shape
 * @author lubiao
 * @createDate 2018年07月30日 上午 11:11:00
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
