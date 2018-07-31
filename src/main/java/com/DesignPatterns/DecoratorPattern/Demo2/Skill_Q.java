package com.DesignPatterns.DecoratorPattern.Demo2;


/**
 * 技能 ：Q
 * @author lubiao
 * @createDate 2018年07月31日 上午 09:14:00
 */
public class Skill_Q extends Skills{

    private String skillName;

    public Skill_Q(Hero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void learnSkill(){
        System.out.println("学习了Q技能："+skillName);
        super.learnSkill();
    }

}
