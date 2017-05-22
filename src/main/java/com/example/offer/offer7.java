package com.example.offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by WHZ on 2017/3/30.
 */
public class offer7 {

    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public static void push(int x){
        stack1.push(x);
    }
    public static Integer pop(){
        int temp = 0;
        int result = 0;
        if(!stack2.isEmpty()){
            return stack2.pop();
        }else if(!stack1.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();

        }else{
            return null;
        }

    }

    public static void main(String args[]){
        push(1);
        push(2);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        push(1);
        push(2);
        System.out.println(pop());
        System.out.println(pop());
    }
}
