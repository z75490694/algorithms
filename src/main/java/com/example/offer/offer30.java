package com.example.offer;

/**
 * Created by WHZ on 2017/4/6.
 */
public class offer30 {

    static int Partion(int[] r,int first,int end){
        int i = first;
        int j = end;
        int pivot = r[i];
        while(i<j){
            while((i<j)&&r[j]>=pivot)
                j--;
            r[i]=r[j];
            while((i<j)&&r[i]<=pivot)
                i++;
            r[j]=r[i];
        }
        r[i] = pivot;
        return i;
    }

    static void GetLeastNumbers(int[] input,int n,int[] output,int k){
        if(input==null || output==null||k>n||n<=0||k<=0){
            return;
        }
        int start = 0;
        int end = n-1;
        int index = Partion(input,start,end);
        while(index!=k-1){
            if(index>k-1){
                end = index-1;
                index = Partion(input,start,end);
            }else{
                start = index+1;
                index = Partion(input,start,end);
            }
        }
        for (int i=0;i<k;i++){
            output[i] = input[i];
        }
    }

    static void Sift(int r[],int k,int m){
        int i=k,j=2*i+1;
        while(j<m){
            if(j<m-1&&r[j]<r[j+1]) j++;
            if(r[i]>r[j]) break;
            else{
                int temp = r[i];
                r[i] = r[j];
                r[j] = temp;
                i = j;
                j = 2*i+1;
            }
        }
    }





    static void HeadSort(int r[],int n){
        for(int i=n/2-1;i>=0;i--){
            Sift(r,i,n);
        }
        for(int i=0;i<n;i++){
            System.out.print(r[0]+" ");
            int temp = r[0];
            r[0] = r[n-i-1];
            r[n-i-1] = temp;
            Sift(r,0,n-i-1);
        }
    }



    public static void main(String[] args){
        int[] input = {49,38,65,97,76,13,27,49};
        int[] output = new int[5];
        /*GetLeastNumbers(input,input.length,output,output.length);
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }*/
        //HeadSort(input,input.length);
        for(int i=0;i<output.length;i++){
            output[i] = input[i];
        }
        for(int i=output.length/2-1;i>=0;i--){
            Sift(output,i,output.length);
        }
        int index = output.length;
        while(index<input.length){
            if(input[index]<output[0]){
                output[0] = input[index];
                Sift(output,0,output.length);
            }
            index++;
        }
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}
