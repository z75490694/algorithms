package com.example.offer;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer36 {

    static int InverseParis(int[] data){
        if(data==null||data.length<0)
            return 0;
        int length = data.length;
        int[] copy = new int[length];
        for(int i=0;i<length;i++)
            copy[i] = data[i];
        int count = InverseParisCore(data,copy,0,length-1);
        return count;
    }

    private static int InverseParisCore(int[] data, int[] copy, int start, int end) {
        if(start == end){
            copy[start] = data[start];
            return 0;
        }

        int length = (end-start)/2;
        int left = InverseParisCore(copy, data, start,start+length);
        int right = InverseParisCore(copy, data, start+length+1,end);
        int i = start+length;
        int j = end;
        int indexCopy = end;
        int count = 0;
        while(i>=start&&j>=start+length+1){
            if(data[i]>data[j]){
                copy[indexCopy--] = data[i--];
                count+=j-start-length;
            }else{
                copy[indexCopy--] = data[j--];
            }
        }
        for(;i>=start;i--){
            copy[indexCopy--] = data[i];
        }
        for (;j>=start+length+1;j--){
            copy[indexCopy--] = data[j];
        }
        return left+right+count;
    }

    public static void main(String args[]){
        int[] a ={7,5,6,4,3};
        System.out.println(InverseParis(a));
    }

}
