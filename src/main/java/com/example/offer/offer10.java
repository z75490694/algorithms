package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer10 {
    int NumberOf1(int n){
        int count = 0;
        while(n!=0){
            ++count;
            n = (n-1)&n;
        }
        return count;
    }
}
