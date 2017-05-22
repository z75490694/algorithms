package com.example.offer;

import java.util.Stack;

/**
 * Created by WHZ on 2017/4/1.
 */
public class offer22 {

    boolean IsPopOrder(int[] pPush,int[] pPop,int length){
        boolean bPossible = false;
        if(pPush!=null&&pPop!=null&&length>0){
            Stack<Integer> data = new Stack<>();
            int pushIndex = 0;
            int popIndex = 0;
            while(popIndex<length){
                while(data.isEmpty()||data.peek()!=pPop[popIndex]){
                    if(pushIndex==length){
                        break;
                    }
                    data.push(pPush[pushIndex]);
                    pushIndex++;
                }
                if(data.peek()!=pPop[popIndex]){
                    break;
                }
                data.pop();
                popIndex++;


            }
            if(data.isEmpty()&&popIndex==length)
                bPossible = true;
        }
        return bPossible;
    }

    public static void main(String[] args){
        offer22 s = new offer22();
        int[] pPush = {1,2,3,4,5};
        int[] pPop = {4,3,5,1,2};
        boolean b = s.IsPopOrder(pPush,pPop,5);
        System.out.print(b);
    }
}
