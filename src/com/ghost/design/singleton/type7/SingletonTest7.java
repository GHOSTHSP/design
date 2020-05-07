package com.ghost.design.singleton.type7;

/**
 * 单例模式
 *      静态内部类
 *          1. 当Singleton装载的时候，静态内部类不会装载
 *          2. 当调用getInstance()时，静态内部类才会被装载，且只装载一次
 *          3. 采用了类装载的机制来保证初始化实例只有一个
 */
public class SingletonTest7 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{

    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}