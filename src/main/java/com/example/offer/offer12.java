package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer12 {

    void Print1ToMaxOfNDigits(int n){
        if(n<=0) return;
        char[] number = new char[n];
        for(int i=0;i<10;i++){
            number[0] = (char)('0'+i);
            Print1ToMaxOfNDigitsRe(number,n,0);
        }
    }

    private void Print1ToMaxOfNDigitsRe(char[] number, int length, int index) {
        if(index==length-1){
            PrintNumber(number);
            return;
        }
        for(int i=0;i<10;i++){
            number[index+1] = (char)('0'+i);
            Print1ToMaxOfNDigitsRe(number,length,index+1);
        }
    }

    private void PrintNumber(char[] number) {
        boolean begin = false;
        for(int i=0;i<number.length;i++){
            if(!begin&&number[i]!='0'){
                begin=true;
            }
            if (begin){
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        offer12 s = new offer12();
        s.Print1ToMaxOfNDigits(2);
    }
}
