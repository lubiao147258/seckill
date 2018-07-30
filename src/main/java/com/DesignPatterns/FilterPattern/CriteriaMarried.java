package com.DesignPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类(标准4：已婚)
 * @author lubiao
 * @createDate 2018年07月30日 下午 03:23:00
 */
public class CriteriaMarried implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> marriedPersons = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("Married")){
                marriedPersons.add(person);
            }
        }
        return marriedPersons;
    }
}
