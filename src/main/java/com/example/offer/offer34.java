package com.example.offer;

/**
 * Created by WHZ on 2017/4/6.
 */
public class offer34 {

    static int GetUglyNumber_Solution(int index){
        if(index <= 0)
            return 0;
        int[] uglyNumbers = new int[index];
        uglyNumbers[0] = 1;
        int nextUglyIndex = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        while(nextUglyIndex<index){
            int min = Min(uglyNumbers[multiply2]*2,uglyNumbers[multiply3]*3,
                    uglyNumbers[multiply5]*5);
            uglyNumbers[nextUglyIndex] = min;
            while(uglyNumbers[multiply2]*2<=uglyNumbers[nextUglyIndex])
                multiply2++;
            while(uglyNumbers[multiply3]*3<=uglyNumbers[nextUglyIndex])
                multiply3++;
            while(uglyNumbers[multiply5]*5<=uglyNumbers[nextUglyIndex])
                multiply5++;
            nextUglyIndex++;
        }
        return uglyNumbers[index-1];
    }


    static int Min(int number1,int number2,int number3){
        int min = (number1<number2)?number1:number2;
        min = (min<number3)?min:number3;
        return min;
    }

    public static void main(String[] args){
        System.out.print(GetUglyNumber_Solution(5));
    }

}
