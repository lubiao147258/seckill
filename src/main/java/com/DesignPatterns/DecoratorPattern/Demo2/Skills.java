package com.DesignPatterns.DecoratorPattern.Demo2;

/**
 * 技能栏
 * @author lubiao
 * @createDate 2018年07月31日 上午 09:11:00
 */
public class Skills implements Hero {

    private Hero hero;

    public Skills(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkill() {
        if (hero!=null){
            hero.learnSkill();
        }
    }
}
