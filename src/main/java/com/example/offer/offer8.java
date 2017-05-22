package com.example.offer;

/**
 * Created by WHZ on 2017/3/30.
 */
public class offer8 {

    public static int Min(int[] number){
        if(number==null|| number.length==0){
            return 0;
        }
        int index1 = 0;
        int index2 = number.length-1;
        int indexMid = index1;
        while(number[index1]>=number[index2]){
            if(index2-index1==1){
                indexMid = index2;
                break;
            }
            indexMid = (index1 + index2) /2;
            if(number[indexMid]==number[index1]&&number[indexMid]==number[index2]){
                return MinInOrder(number,index1,index2);
            }
            if(number[indexMid]>=number[index1]){
                index1 = indexMid;
            }else if(number[indexMid]<=number[index2]){
                index2 = indexMid;
            }
        }
        return number[indexMid];
    }

    static int MinInOrder(int[] number,int index1,int index2){
        int result = number[index1];
        for(int i=index1+1;i<=index2;i++){
            if(result>number[i]){
                result = number[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] number = {1};
        System.out.print(Min(number));
    }
}
