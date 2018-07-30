package com.DesignPatterns.FilterPattern;

import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类(组合标准5：例如：单身且男性)
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:38:00
 */
public class AndCriteria implements Criteria{

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
