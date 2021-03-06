package com.DesignPatterns.BridgePattern;

/**
 * 创建实现了 DrawAPI 接口的实体桥接实现类
 * @author lubiao
 * @createDate 2018年07月30日 上午 11:10:00
 */
public class GreenCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("画圆[颜色：green , 半径："+radius +" , 横坐标:"+x+" , 纵坐标:"+y+"]");
    }
}
