package com.example.offer;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer38 {

    int getUpper(int arr[], int key){//获取某个元素最后出现位置
        int low = 0, high = arr.length - 1;
        //其实是一个递归迭代
        while(low < high){
            int mid = (low + high + 1) / 2;
            if(arr[mid] <= key)
                //当要查找的值比中位数大于等于时，把查找的低位限制为mid
                low = mid;
            else
                //当要找的值比 中位数小时，，把查找的高位限制为mid-1
                high = mid - 1;
        }
//    返回最后出现位置
        return low;
    }
    int getLower(int arr[], int key){//获取某个元素第一次出现位置
        int low = 0, high = arr.length - 1;
        while(low < high){
            int mid = (low + high) / 2;
            //当要找的值比 中位数小于等于时，，把查找的高位限制为mid+1
            if(arr[mid] >= key)
                high = mid;
            else
                //当要找的值比 中位数大时，，把查找的低位限制为mid+1
                low = mid + 1;
        }
        //返回第一次出现位置
        return low;
    }

    int GetNumOfK(int arr[], int key){
        if(arr!=null&&arr.length!=0){
            return getUpper(arr,key)-getLower(arr,key);
        }else{
            return -1;
        }
    }
}
