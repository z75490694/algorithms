package com.example.offer;

import java.util.Arrays;


/**
 * Created by WHZ on 2017/4/7.
 */
public class offer44 {

    boolean IsContinuous(int[] numbers,int length){
        if(numbers==null||length<1)
            return false;
        Arrays.sort(numbers);
        int numberOfZero = 0;
        int numberOfGap = 0;
        for(int i=0;i<length;i++){
            if(numbers[i]==0)
                numberOfZero++;
        }
        int small = numberOfZero;
        int big = small+1;
        while(big<length){
            if(numbers[small]==numbers[big])
                return false;
            numberOfGap += numbers[big] - numbers[small] -1;
            small = big;
            ++big;
        }
        return (numberOfZero>=numberOfGap);
    };
}
