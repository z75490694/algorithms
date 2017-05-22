package com.example.other;

import java.util.ArrayList;

/**
 * Created by WHZ on 2017/4/15.
 */
public class GetLeastNum {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        if(k>input.length) return a;
        for(int i=input.length/2-1;i>=0;i--){
            Sift(input,i,input.length);
        }
        for(int i = 0;i<k;i++){
            a.add(input[0]);
            input[0] = input[input.length-i-1];
            Sift(input,i,input.length-i);
        }
        return a;
    }

    public static void Sift(int [] r,int k,int m){
        int i = k;
        int j = 2*i+1;
        while(i<m&&j<m){
            if(j<m-1&&r[j]>r[j+1]) j++;
            if(r[i]<r[j]) break;
            int tmp = r[i];
            r[i] = r[j];
            r[j] = tmp;
            i = j;
            j = 2*i+1;
        }

    }

    public static void main(String[] args){
        int[] data = {12,1431,12312,543,534,52,3,12343,34,234};
        ArrayList<Integer> result = GetLeastNumbers_Solution(data,2);
        for(Integer i:result){
            System.out.print(i+" ");
        }
    }
}
