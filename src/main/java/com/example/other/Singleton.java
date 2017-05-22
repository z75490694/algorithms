package com.example.other;

/**
 * Created by WHZ on 2017/4/17.
 */
public class Singleton {
    private volatile static Singleton instance; //对象初始化非原子操作，volatile关键字放置指令重排
    private Singleton (){
    }
    public static Singleton getInstance(){    //对获取实例的方法进行同步
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null)
                    instance = new Singleton(); //
            }
        }
        return instance;
    }
}
