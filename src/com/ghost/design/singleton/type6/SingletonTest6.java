package com.ghost.design.singleton.type6;

/**
 * 单例模式
 *     双重检查
 */
public class SingletonTest6 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}


class Singleton{

    private Singleton(){}

    private static volatile Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}