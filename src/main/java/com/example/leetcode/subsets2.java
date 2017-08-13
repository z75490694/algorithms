package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by WHZ on 2017/7/3.
 */
public class subsets2 {
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> subSet = new ArrayList<Integer>();
        result.add(subSet); //空集
        int size = num.length;
        if (size <= 0) return result;

        Arrays.sort(num); //先进行排序

        int start = 0, dup = num[0];
        for (int i = 0; i < size; i++) {
            int len = result.size();
            int j = (len == 1 || num[i] != dup) ? 0 : len - start;
            start = 0;
            for (; j < len; j++) {
                subSet = new ArrayList<Integer>(result.get(j));
                subSet.add(num[i]);
                result.add(subSet);
                start++;
            }
            dup = num[i];
        }

        return result;
    }
}
