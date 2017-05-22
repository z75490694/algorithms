package com.example.designpattern.singleton;

/**
 * Created by WHZ on 2017/5/22.
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){}
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
