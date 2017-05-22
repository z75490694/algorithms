package com.example.other;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by WHZ on 2017/3/25.
 */
public class Combination {




    public static void combination(char chs[]){
        if(chs==null||chs.length==0){
            return;
        }
        List<Character> list = new ArrayList<>();
        for(int i=1;i<=chs.length;i++){
            combine(chs,0,i,list);
        }
    }

    private static void combine(char[] cs, int begin, int number, List<Character> list) {
        if(number==0){
            System.out.println(list.toString());
            return;
        }
        if(begin==cs.length){
            return;
        }
        list.add(cs[begin]);
        combine(cs,begin+1,number-1,list);
        list.remove((Character) cs[begin]);
        combine(cs,begin+1,number,list);
    }


    public static void main(String args[]){
        char[] chs = {'a','b','c'};
        combination(chs);

    }





}
