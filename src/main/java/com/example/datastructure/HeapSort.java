package com.example.datastructure;

/**
 * Created by WHZ on 2017/4/23.
 */
public class HeapSort {

     static void Sift(int [] r,int k,int m){
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
    static void HeapSort(int[] r){
         for(int i = r.length/2-1;i>=0;i--){
             Sift(r,i,r.length);
         }
         for(int i = 0;i<r.length;i++){
             System.out.print(r[0]+" ");
             r[0] = r[r.length-i-1];
             Sift(r,0,r.length-i-1);
         }
    }
    public static void main(String[] args){
        int[] data = {12,1431,12312,543,534,52,3,12343,34,234};
        HeapSort(data);

    }



}
