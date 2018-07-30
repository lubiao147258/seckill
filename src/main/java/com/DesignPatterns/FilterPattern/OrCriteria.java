package com.DesignPatterns.FilterPattern;

import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类(组合标准6：例如：单身或者女性)
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:43:00
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for(Person person : otherCriteriaItems){
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
