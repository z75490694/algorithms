package com.example.test;

/**
 * Created by WHZ on 2017/4/16.
 */
public class TestInterfaceAbstract {

    interface A{
        int a = 0;
        public void f2();
    }

    abstract class B{
        int b = 0;
        public void f1(){

        }
        abstract public void f2();
    }
}
