package com.DesignPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类(标准3：单身)
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:33:00
 */
public class CriteriaSingle implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getMaritalStatus().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
