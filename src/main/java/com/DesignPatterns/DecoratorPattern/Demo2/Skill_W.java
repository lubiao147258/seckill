package com.DesignPatterns.DecoratorPattern.Demo2;


/**
 * 技能 ：R
 * @author lubiao
 * @createDate 2018年07月31日 上午 09:18:00
 */
public class Skill_W extends Skills {

    private String skillName;

    public Skill_W(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill(){
        System.out.println("学习了W技能："+skillName);
        super.learnSkill();
    }
}
