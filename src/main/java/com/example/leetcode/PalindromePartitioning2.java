package com.example.leetcode;

import java.util.ArrayList;

/**
 * Created by WHZ on 2017/6/13.
 */
public class PalindromePartitioning2 {
    public int minCut(String s) {
        if (s == null || s.length() <= 1){
            return 0;
        }
        int n = s.length();
        int i;
        int j;
        int[] minCut = new int[n + 1];
        for (i = 0; i < n + 1; i++){
            minCut[i] = i - 1;
        }
        for(i = 1; i < n; i++){
            // odd-length
            for (j = 0; i - j >= 0 && i + j < n && s.charAt(i - j) == s.charAt(i + j); j++){
                minCut[i + j + 1] = Math.min(minCut[i + j + 1], minCut[i - j] + 1);
            }
            // even-length
            for (j = 0; i - j - 1 >= 0 && i + j < n && s.charAt(i - j - 1) == s.charAt(i + j); j++){
                minCut[i + j + 1] = Math.min(minCut[i + j + 1], minCut[i - j - 1] + 1);
            }
        }
        return minCut[n];
    }
}
