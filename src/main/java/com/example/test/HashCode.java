package com.example.test;

/**
 * Created by WHZ on 2017/4/15.
 */
public class HashCode {

    public static void main(String[] args) {


        String str3 = new String("abc");
        String str1 = "abc";
        String str2 = "abc";
        if(str3==str1){
            System.out.println("str3==str1");
        }
        System.out.print(str3.hashCode()+" "+str1.hashCode()+" "+str2.hashCode());

    }
}
