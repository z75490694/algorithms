package com.example.offer;

/**
 * Created by WHZ on 2017/4/6.
 */
public class offer32 {

    static int NumberOf1Between1AndN(int n){
        if(n<=0)
            return 0;
        String str = String.valueOf(n);
        char[] strN = str.toCharArray();
        return NumberOf1(strN);
    }

    static private int NumberOf1(char[] strN) {
        if(strN==null||strN.length==0||strN[0]<'0'||strN[0]>'9'){
            return 0;
        }
        int first = strN[0] - '0';
        int length = strN.length;
        if(length==1 && first==0)
            return 0;
        if(length==1 && first>0)
            return 1;
        int numFirstDigit = 0;
        if(first > 1)
            numFirstDigit = PowerBase10(length-1);
        else if(first==1)
            numFirstDigit = Integer.parseInt(String.valueOf(strN).substring(1))+1;
        int numOtherDigits = first*(length-1)*PowerBase10(length-2);
        int numRecursive = NumberOf1(String.valueOf(strN).substring(1).toCharArray());
        return numFirstDigit+numOtherDigits+numRecursive;
    }

    static private int PowerBase10(int n) {
        int result = 1;
        for(int i=0;i<n;i++){
            result *=10;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.print(NumberOf1Between1AndN(21345));
    }

}
