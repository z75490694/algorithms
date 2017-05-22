package com.example.offer;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer41 {

    boolean FindNumbersWithSum(int[] data,int length,int sum,int[] num1,int[] num2){
        boolean found = false;
        if(length<1||num1==null||num2==null)
            return found;
        int ahead = length-1;
        int behind = 0;
        while(ahead>behind){
            long curSum = data[ahead]+data[behind];
            if(curSum==sum){
                num1[0] = data[behind];
                num2[0] = data[ahead];
                found = true;
                break;
            }else if(curSum>sum)
                ahead--;
            else
                behind++;
        }
        return found;
    }

    void FindContinuousSequence(int sum){
        if(sum<3)
            return;
        int small = 1;
        int big = 2;
        int middle = (1+sum) /2;
        int curSum = small+big;
        while(small<middle){
            if(curSum==sum)
                PrintContinuousSequence(small,big);
            while(curSum>sum&&small<middle)
            {
                curSum -=small;
                small++;
                if(curSum==sum)
                    PrintContinuousSequence(small,big);
            }
            big++;
            curSum+=big;
        }
    }

    private void PrintContinuousSequence(int small, int big) {
        for(int i = small;i<=big;i++)
            System.out.print(i);
        System.out.println();
    }


}
