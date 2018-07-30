package com.DesignPatterns.CompositePattern;

/**
 * 使用 Employee 类来创建和打印员工的层次结构。
 * @author lubiao
 * @createDate 2018年07月30日 下午 05:15:00
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("Rubio","CEO",30000);

        Employee headSales = new Employee("Robert","Head Sales", 20000);

        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for(Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
            for(Employee  employee : headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }

    }
}
