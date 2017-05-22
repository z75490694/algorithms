package com.example.offer;

/**
 * Created by WHZ on 2017/4/6.
 */
public class offer35 {

    static char FirstNotRepeatingChar(String a){
        if(a==null)
            return '\0';
        int[] hashTable = new int[256];
        for(int i=0;i<hashTable.length;i++){
            hashTable[i] = 0;
        }
        for(int i=0;i<a.length();i++){
            hashTable[a.charAt(i)]++;
        }
        for(int i=0;i<a.length();i++){
            if(hashTable[a.charAt(i)]==1)
                return a.charAt(i);
        }
        return '\0';

    }

    public static void main(String[] args){
        System.out.print(FirstNotRepeatingChar("abaccdeff"));
    }
}
