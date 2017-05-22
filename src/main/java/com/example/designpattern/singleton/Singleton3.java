package com.example.designpattern.singleton;

/**
 * Created by WHZ on 2017/5/22.
 */
public class Singleton3 {
    private volatile static Singleton3 singleton;
    private Singleton3(){}
    public static Singleton3 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton3.class) {
                if (singleton == null) {
                    singleton = new Singleton3();
                }
            }
        }
        return singleton;
    }
}
