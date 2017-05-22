package com.example.datastructure;

/**
 * Created by WHZ on 2017/4/23.
 */
public class MergeSort {

    static void Merge(int[] r,int[] r1,int s,int m,int t){
        int i = s;
        int j = m+1;
        int k = s;
        while(i<=m&&j<=t){
            if(r[i]<r[j]) r1[k++]=r[i++];
            else r1[k++]=r[j++];
        }
        while(i<=m) r1[k++]=r[i++];
        while(j<=t) r1[k++]=r[j++];
    }

    static void MergeSort(int[] r,int[] r1,int s,int t){
        int[] r2 = new int[r.length];
        if(s==t) r1[s] = r[s];
        else{
            int m = (s+t)/2;
            MergeSort(r,r2,s,m);
            MergeSort(r,r2,m+1,t);
            Merge(r2,r1,s,m,t);
        }
    }

    public static void main(String[] args){
        int[] data = {12,1431,12312,543,534,52,3,12343,34,234};
        MergeSort(data,data,0,data.length-1);
        for(Integer i:data){
            System.out.print(i+" ");
        }
    }
}
