package com.example.offer;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer40 {

    static void FindNumsAppearOnce(int[] data, int[] num1, int[] num2){
        if(data==null||data.length<2)
            return;
        int resultXOR = 0;
        for(int i=0;i<data.length;i++){
            resultXOR^=data[i];
        }
        int indexOf1 = FindFirstBitIs1(resultXOR);
        for(int j=0;j<data.length;j++){
            if(IsBit1(data[j],indexOf1))
                num1[0] ^= data[j];
            else
                num2[0] ^= data[j];
        }
    }

    static private int FindFirstBitIs1(int num) {
        int indexBit = 0;
        while((num&1)==0&&indexBit<32){
            num = num>>1;
            indexBit++;
        }
        return indexBit;
    }

    static boolean IsBit1(int num,int indexBit){
        num = num>>indexBit;
        return (num&1)==1;
    }

    public static void main(String[] args){
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        int[] num = {2,4,3,6,3,2,5,5};
        FindNumsAppearOnce(num,num1,num2);
        System.out.print(num1[0]);
        System.out.print(num2[0]);
    }
}
