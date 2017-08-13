package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/12.
 */
public class SingleNumber {
    public int singleNumber(int[] A) {
        int result = A[0];
        for (int i = 1; i < A.length; i++)
            result = result ^ A[i];
        return result;
    }
}
