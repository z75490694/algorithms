package com.example.offer;

import java.util.Stack;

/**
 * Created by WHZ on 2017/4/1.
 */
public class offer21 {

    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    void push(int val){
        data.push(val);
        if(!min.empty()||min.peek()>val){
            min.push(val);
        }else{
            min.push(min.peek());
        }
    }

    void pop(){
        if(!data.empty()&&!min.empty()){
            data.pop();
            min.pop();
        }
    }

    int min(){
        return min.peek();
    }
}
