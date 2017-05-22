package com.example.offer;

/**
 * Created by WHZ on 2017/4/6.
 */
public class offer31 {

    static int FindGreatestSumOfSubArray(int[] data){
        if(data==null||data.length<=0){
            return 0;
        }
        int max = data[0];
        int sum = 0;
        for(int i=0;i<data.length;i++){
            if(sum<=0){
                sum = data[i];
            }else{
                sum+= data[i];
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] a = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(a));
    }
}
