package com.ghost.design.singleton.type2;

/**
 * 单例模式
 *     饿汉式（静态代码块）
 */
public class SingletonTest2 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{

    private Singleton(){}

    private final static Singleton instance;

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }

}
