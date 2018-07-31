package com.DesignPatterns.FacadePattern;

/**
 * @author lubiao
 * @createDate 2018年07月31日 上午 11:02:00
 */
public class FacadepatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }

}
