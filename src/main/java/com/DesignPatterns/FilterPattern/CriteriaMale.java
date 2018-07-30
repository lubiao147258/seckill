package com.DesignPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建实现了 Criteria 接口的实体类(标准1：男性)
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:24:00
 */
public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("male")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
