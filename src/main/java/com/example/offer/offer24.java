package com.example.offer;

/**
 * Created by WHZ on 2017/4/1.
 */
public class offer24 {
    boolean VerifySequenceOfBST(int sequence[],int start,int end){
        if(sequence==null||sequence.length<=0) return false;
        int root = sequence[end-1];
        int i = start;
        for(;i<end-1;i++){
            if(sequence[i]>root){
                break;
            }
        }
        for(int j=i;j<end-1;j++){
            if(sequence[j]<root)
                return false;
        }
        boolean left = true;
        if(i>start)
            left = VerifySequenceOfBST(sequence,start,i);
        boolean right = true;
        if(i<end-1)
            right = VerifySequenceOfBST(sequence,i,end-1);
        return left&&right;
    }

    public static void main(String[] args){
        offer24 s = new offer24();
        int[] a ={7,4,6,5};
        System.out.print(s.VerifySequenceOfBST(a,0,a.length));

    }
}
