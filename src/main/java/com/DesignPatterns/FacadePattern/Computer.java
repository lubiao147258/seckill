package com.DesignPatterns.FacadePattern;


/**
 * @author lubiao
 * @createDate 2018年07月31日 上午 10:50:00
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startup(){
        System.out.println("computer启动");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("computer启动完毕！");
    }

    public void shutdown(){
        System.out.println("computer关闭");
        cpu.shutdowm();
        memory.shutdowm();
        disk.shutdowm();
        System.out.println("computer关闭完毕！");
    }
}
