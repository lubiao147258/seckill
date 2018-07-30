package com.DesignPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类(标准2：女性)
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:29:00
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
