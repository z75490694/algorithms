package com.example.offer;

/**
 * Created by WHZ on 2017/3/23.
 */
public class offer3 {

    static int[][] matrix = {
            {1,2,8,9},
            {2,4,9,12},
            {4,7,10,13},
            {6,8,11,15}
    };

    public static boolean find(int[][] matrix,int num){
        boolean found = false;
        if(matrix!=null){
            int rows = matrix.length;
            int columns = matrix[0].length;
            int row = 0;
            int column = columns-1;
            while (row<rows && column>=0){
                if(matrix[row][column]==num){
                    found = true;
                    break;
                }else if(matrix[row][column]>num){
                    column--;
                }else{
                    row++;
                }
            }
        }
        return found;

    }

    public static void main(String args[]){
        System.out.println(find(matrix,100));
    }

}
