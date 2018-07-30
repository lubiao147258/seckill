package com.DesignPatterns.FilterPattern;

import java.util.List;

/**
 * 为标准（Criteria）创建一个接口。
 * @author lubiao
 * @createDate 2018年07月30日 下午 02:22:00
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
