package com.example.exception;

/**
 * Created by WHZ on 2017/6/19.
 */

//在覆盖方法中，派生类如果抛出异常，必须在基类声明过该异常
//派生类方法可以不抛出基类异常
public class FullConstructors {
    public static void f() throws MyException{
        System.out.println("Throwing MyException from f()");
        throw new MyException();
    }
    public static void g() throws MyException{
        System.out.println("Throwing MyException from g()");
        throw new MyException();
    }

    public static void main(String[] args){
        try {
            f();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
        try {
            g();
        }catch (MyException e){
            e.printStackTrace(System.out);
        }
    }
}
