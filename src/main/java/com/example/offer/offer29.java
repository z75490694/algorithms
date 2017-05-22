package com.example.offer;

/**
 * Created by WHZ on 2017/4/6.
 */
public class offer29 {

    //超过一半的数字为排序数组的中位数
    static int Partion(int[] r,int first,int end){
        int i = first;
        int j = end;
        int pivot = r[i];
        while(i<j){
            while((i<j)&&r[j]>=pivot)
                j--;
            r[i]=r[j];
            while((i<j)&&r[i]<=pivot)
                i++;
            r[j]=r[i];
        }
        r[i] = pivot;
        return i;
    }

    static int MoreThanHalfNum(int[] numbers,int length){
        int middle = length>>1;
        int start = 0;
        int end = length-1;
        int index = Partion(numbers,start,end);
        while(index!=middle){
            if(index>middle){
                end = index-1;
                index = Partion(numbers,start,end);
            }else{
                start = index+1;
                index = Partion(numbers,start,end);
            }
        }
        int result = numbers[middle];
        return result;
    }

    //数组过半的数的个数比其余数的个数加起来还要多
    static int MoreThanHalfNum2(int[] numbers,int length){
        int result = numbers[0];
        int times = 1;
        for(int i=1;i<length;i++){
            if(times==0){
                result = numbers[i];
                times=1;
            }else if(numbers[i] == result){
                times++;
            }else{
                times--;
            }
        }
        return result;
    }

    public static void main(String[] args){
         int[] a = {1,2,3,2,2,2,44,2,2};
         int median = MoreThanHalfNum2(a,a.length);
         System.out.println(median);
    }
}
