package com.DesignPatterns.SingletonPattern;

/**
 * 饿汉式
 * @author lubiao
 * @createDate 2018年07月27日 下午 02:17:00
 */
public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("饿汉式-单例模式!");
    }
}

/**
 * 懒汉式（线程不安全）
 */
/*public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance;

    //私有化构造器
    private SingleObject(){}

    //获取唯一可用的对象
    public static SingleObject getInstance(){
        if (instance == null){
            return new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("懒汉式-单例模式（线程不安全）!");
    }
}*/


/**
 * 懒汉式（线程安全方式）
 */
/*public class SingleObject {
    //创建 SingleObject 的一个对象
    private static SingleObject instance;

    //私有化构造器
    private SingleObject(){}

    //获取唯一可用的对象
    public static synchronized SingleObject getInstance(){
        if (instance == null){
            return new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("懒汉式-单例模式（线程不安全）!");
    }
}*/


