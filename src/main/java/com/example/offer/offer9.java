package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer9 {

    long Fibonacci(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        return Fibonacci(n-2)+Fibonacci(n-1);
    }

    long Fibonacci2(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        long fibNMinusOne = 1;
        long fibNMinusTwo = 0;
        long fibN = 0;
        for(int i=2;i<=n;i++){
            fibN = fibNMinusOne+fibNMinusTwo;
            fibNMinusTwo = fibNMinusOne;
            fibNMinusOne = fibN;
        }
        return fibN;
    }
}
