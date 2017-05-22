package com.example.other;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by WHZ on 2017/4/20.
 */
public class AlibabaTest {

    static int max = Integer.MAX_VALUE;
    static String result = "";
    static int count = 0;
    static ArrayList<String> res = new ArrayList<>();


    static void jump(String arr) {

        String[] step = arr.split(",");

        res.add(step[0]);
        helper(step,0);


    }

    static void helper(String[] step,int begin){

        if(begin >= step.length-1){
            /*if(count==1){
                res = res+step[step.length-1];
            }else{
                res = res+","+step[step.length-1];
            }*/
            if(count<=max){
                max = count;
                String temp = "";
                for(String s:res){
                    temp = temp+","+s;
                }
                result = temp.substring(1);
            }

            return;
        }
        for(int i=1;i<=Integer.parseInt(step[begin]);i++){
            int index = begin+i;
            if(index>=step.length-1){
                index = step.length-1;
            }
            count++;
            res.add(step[index]);

            helper(step,index);
            count--;
            res.remove(res.size()-1);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);


        String _arr;
        try {
            _arr = in.nextLine();
        } catch (Exception e) {
            _arr = null;
        }

        jump(_arr);
        System.out.println(result);
    }
}
