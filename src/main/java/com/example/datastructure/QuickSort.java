package com.example.datastructure;

/**
 * Created by WHZ on 2017/4/15.
 */
public class QuickSort {

    public static int Partion(int r[],int first,int end){
        int i=first;
        int j=end;
        int key=r[i];
        while(i<j){
            while(i<j&&r[j]>=key){
                j--;
            }
            r[i] = r[j];
            while(i<j&&r[i]<=key){
                i++;
            }
            r[j] = r[i];
        }
        r[i] = key;
        return i;
    }

    public static void quickSort(int[] a,int i,int j){
        if(i<j){
            int pos = Partion(a,i,j);
            quickSort(a,i,pos-1);
            quickSort(a,pos+1,j);
        }

    }

    public static void main(String[] args){
        int[] data = {12,1431,12312,543,534,52,3,12343,34,234};
        quickSort(data,0,data.length-1);
        for(Integer i:data){
            System.out.print(i+" ");
        }
    }
}
