package com.DesignPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:47:00
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("王麻", "Male","Single"));
        persons.add(new Person("李思", "Male","Married"));
        persons.add(new Person("张珊", "Female","Married"));
        persons.add(new Person("王迪", "Female","Single"));
        persons.add(new Person("马克", "Male","Single"));
        persons.add(new Person("杰克", "Male","Single"));


        Criteria male = new CriteriaMale();//男性
        Criteria female = new CriteriaFemale();//女性
        Criteria single = new CriteriaSingle();//单身
        Criteria married = new CriteriaMarried();//已婚

        Criteria singleMale = new AndCriteria(single, male);//单身and男性条件
        Criteria singleFemale = new AndCriteria(single, female);//单身and男性条件
        Criteria marriedMale = new AndCriteria(married, male);//已婚and女性条件
        Criteria marriedFemale = new AndCriteria(married, female);//已婚and女性条件

        Criteria singleOrFemale = new OrCriteria(single, female);//or条件(可以根据自己具体的情况填写)

        System.out.println("男性：");
        printPersons(male.meetCriteria(persons));

        System.out.println("\n女性：");
        printPersons(female.meetCriteria(persons));

        System.out.println("\n单身：");
        printPersons(single.meetCriteria(persons));

        System.out.println("\n已婚：");
        printPersons(married.meetCriteria(persons));

        System.out.println("\n单身男性：");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\n单身女性：");
        printPersons(singleFemale.meetCriteria(persons));

        System.out.println("\n已婚男性：");
        printPersons(marriedMale.meetCriteria(persons));

        System.out.println("\n已婚女性：");
        printPersons(marriedFemale.meetCriteria(persons));

        System.out.println("\n单身或者女性：");
        printPersons(singleOrFemale.meetCriteria(persons));

    }


    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ 姓名 : " + person.getName()
                    +", 性别 : " + person.getGender()
                    +", 婚姻状况 : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
