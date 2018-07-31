package com.DesignPatterns.DecoratorPattern.Demo2;

/**
 * 技能 ：R
 * @author lubiao
 * @createDate 2018年07月31日 上午 09:23:00
 */
public class Skill_R extends Skills {


    private String skillName;

    public Skill_R(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        System.out.println("学习了R技能："+skillName);
        super.learnSkill();
    }
}
