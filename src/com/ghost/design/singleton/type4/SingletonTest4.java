package com.ghost.design.singleton.type4;

/**
 * 单例模式
 *    懒汉式（线程安全）
 *
 */
public class SingletonTest4 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }


}

class Singleton{

    private Singleton(){}

    private static Singleton instance;

    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
