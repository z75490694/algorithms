package com.example.designpattern.builder;

/**
 * Created by WHZ on 2017/5/22.
 */
public class Client {

    public static void main(String[] args){
        new User.UserBuilder("王", "小二")
                .age(20)
                .phone("123456789")
                .address("亚特兰蒂斯大陆")
                .build();
    }
}
