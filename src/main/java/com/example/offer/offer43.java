package com.example.offer;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer43 {

    static int maxValue = 6;
    static void PrintProbability(int number){
        if(number<1)
            return;
        int maxSum = number*maxValue;
        int[] Probabilities = new int[maxSum-number+1];
        for(int i=number;i<=maxSum;i++)
            Probabilities[i-number] = 0;
        Probability(number,Probabilities);
        int total = (int)Math.pow(maxSum,number);
        for(int i = number;i<=maxSum;i++){
            double ratio = (double)Probabilities[i-number]/total;
            System.out.printf("%d: %f\n",i,ratio);
        }
    }

    static private void Probability(int number, int[] probabilities) {
        for(int i = 1;i<=maxValue;i++){
            Probability(number,number,i,probabilities);
        }
    }

    static private void Probability(int original, int current, int sum, int[] probabilities) {
        if(current==1){
            probabilities[sum-original]++;
        }else{
            for(int i=1;i<=maxValue;i++){
                Probability(original,current-1,i+sum,probabilities);
            }
        }
    }

    static void PrintProbability2(int number){
        if(number<1)
            return;
        int[][] Probabilities = new int[2][maxValue*number+1];
        for(int i=0;i<maxValue*number+1;i++){
            Probabilities[0][i] = 0;
            Probabilities[1][i] = 0;
        }
        int flag = 0;
        for(int i =1;i<=maxValue;i++)
            Probabilities[flag][i] = 1;
        for(int k=2;k<=number;k++){
            for(int i=0;i<k;i++)
                Probabilities[1-flag][i]=0;
            for(int i=k;i<=maxValue*k;i++){
                Probabilities[1-flag][i]=0;
                for(int j=1;j<=i&&j<=maxValue;j++)
                    Probabilities[1-flag][i]+=Probabilities[flag][i-j];
            }
            flag = 1-flag;
        }
        double total = Math.pow(maxValue,number);
        for(int i = number;i<=maxValue*number;i++){
            double ratio = (double)Probabilities[flag][i]/total;
            System.out.printf("%d: %f\n",i,ratio);
        }
    }

    public static void main(String[] args){
        PrintProbability2(2);
    }
}
