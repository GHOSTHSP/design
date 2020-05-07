package com.ghost.design.singleton.type8;

/**
 * 单例模式
 *     枚举
 *   优点：不仅能够避免多线程问题，而且还能防止反序列化重新创建新的对象
 */
public class SingletonTest8 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        singleton1.say();
    }
}

enum Singleton{
    INSTANCE;
    public void say(){
        System.out.println("hello world");
    }


}