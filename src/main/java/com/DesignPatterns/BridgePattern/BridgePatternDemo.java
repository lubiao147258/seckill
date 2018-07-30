package com.DesignPatterns.BridgePattern;

/**
 * 使用 Shape 和 DrawAPI 类画出不同颜色的圆
 * @author lubiao
 * @createDate 2018年07月30日 上午 11:23:00
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(),100,100,10);
        Shape greenCircle = new Circle(new GreenCircle(), 100,100,10);

        redCircle.draw();
        greenCircle.draw();
    }
}
