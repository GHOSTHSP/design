package com.ghost.design.singleton.type3;

/**
 * 单例模式
 *     懒汉式（线程不安全）
 */
public class SingletonTest3 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton{

    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
