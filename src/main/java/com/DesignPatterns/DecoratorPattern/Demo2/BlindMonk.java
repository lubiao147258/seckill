package com.DesignPatterns.DecoratorPattern.Demo2;

/**
 * 具体英雄——盲僧
 * @author lubiao
 * @createDate 2018年07月31日 上午 09:09:00
 */
public class BlindMonk implements Hero {

    private String  name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    public void learnSkill() {
        System.out.println(name + "学习了以上的技能！");
    }
}
