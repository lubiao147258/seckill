package com.DesignPatterns.BuilderPattern;

/**
 * 实现食物包装条目
 * @author lubiao
 * @createDate 2018年07月27日 下午 03:11:00
 */
public class Wapper implements Packing {
    @Override
    public String Pack() {
        return "纸盒";
    }
}
