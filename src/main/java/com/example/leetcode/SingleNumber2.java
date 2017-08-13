package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/12.
 */
public class SingleNumber2 {
    public int singleNumber(int[] A) {
        int res=0;
        int[]a=new int[32];
        for(int i=0;i<32;i++){
            for(int b:A){
                int c=(b>>i)&1;
                a[i]=a[i]+c;
            }
            res=res|(a[i]%3)<<i;
        }
        return res;
    }
}
