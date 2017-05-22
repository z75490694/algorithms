package com.example.test;

/**
 * Created by WHZ on 2017/4/15.
 */
public class Genericity {

    public static void main(String[] args){

        Box<Integer> a = new Box<>();
        a.data = 1;
        Box<Float> b = new Box<>();
        b.data = 1.23f;
        Box<String> c = new Box<>();
        c.data = "asdasd";
        Box<Number> d = new Box<>();
        d.data = 1.23f;
        getData(c);
        getUpperNumberData(a);
        getNumberData(d);
    }

    public static void getData(Box<?> box){
        System.out.println(box.data);
    }

    public static void getUpperNumberData(Box<? extends Number> box){
        System.out.println(box.data);
    }

    public static void getNumberData(Box<Number> box){
        System.out.println(box.data);
    }

}

class Box<T>{
    T data;
}
