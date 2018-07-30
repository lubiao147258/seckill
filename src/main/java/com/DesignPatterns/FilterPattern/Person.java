package com.DesignPatterns.FilterPattern;

/**
 * 创建一个类，在该类上应用标准
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:18:00
 */
public class Person {

    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}
