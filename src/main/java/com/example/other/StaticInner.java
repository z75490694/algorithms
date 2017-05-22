package com.example.other;

/**
 * Created by WHZ on 2017/4/18.
 */
public class StaticInner {

    int val = 0;

    static int as = 0;

    public static class A{
        int a = as;
    }

    public class B{
        int a = val;
    }
}
