package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer20 {
    void PrintMatrixClockwisely(int[][] numbers){
        if(numbers==null||numbers.length<=0) return;
        int start = 0;
        int rows = numbers.length;
        int columns = numbers[0].length;
        while(columns>start*2&&rows>start*2){
            PrintMatrixInCircle(numbers,columns,rows,start);
            start++;
        }
    }

    private void PrintMatrixInCircle(int[][] numbers, int columns, int rows, int start) {
        int endX = columns-1-start;
        int endY = rows-1-start;
        for(int i=start;i<=endX;i++){
            System.out.print(numbers[start][i]);
        }
        if(start<endY){
            for(int i=start+1;i<=endY;i++){
                System.out.print(numbers[i][endX]);
            }
        }
        if(start<endX&&start<endY){
            for(int i=endX-1;i>=start;i--){
                System.out.print(numbers[endY][i]);
            }
        }
        if(start<endX&&start<endY-1){
            for(int i=endY-1;i>=start+1;i--){
                System.out.print(numbers[i][start]);
            }
        }


    }

    public static void main(String[] args){
        offer20 o = new offer20();
        int[][] num = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        o.PrintMatrixClockwisely(num);
    }
}
