package com.DesignPatterns.DecoratorPattern.Demo2;


/**
 * 技能 ：E
 * @author lubiao
 * @createDate 2018年07月31日 上午 09:20:00
 */
public class Skill_E extends Skills {

    private String skillName;

    public Skill_E(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill() {
        System.out.println("学习了E技能："+skillName);
        super.learnSkill();
    }
}
