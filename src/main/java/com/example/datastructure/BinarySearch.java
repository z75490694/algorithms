package com.example.datastructure;

/**
 * Created by WHZ on 2017/4/23.
 */
public class BinarySearch {

    static int Search_Bin(int[] a,int key){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int middle = (low+high)/2;
            if(a[middle]==key) return middle;
            else if(a[middle]<key) low = middle;
            else high = middle;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.print(Search_Bin(a,4));
    }
}
