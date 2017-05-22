package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer14 {

    void ReorderOddEven(int[] data){
        if(data==null||data.length==0) return;
        int begin = 0;
        int end = data.length-1;
        while(begin<end){
            while (begin<end&&(begin&1)!=0) begin++;
            while (begin<end&&(end&1)==0) end--;
            if(begin<end){
                int temp = data[begin];
                data[begin] = data[end];
                data[end] = temp;
            }
        }
    }
}
