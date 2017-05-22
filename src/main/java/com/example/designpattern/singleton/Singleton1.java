package com.example.designpattern.singleton;

/**
 * Created by WHZ on 2017/5/22.
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1 (){}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
