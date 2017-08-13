package com.example.leetcode;

import java.util.Arrays;

/**
 * Created by WHZ on 2017/6/13.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {
        if(num == null||num.length == 0)
            return 0;
        Arrays.sort(num);
        int count =1;
        int max=1;
        for(int i=1;i<num.length;i++)
        {
            if(num[i]==num[i-1]+1)
            {
                count++;
                if(count>max)
                    max=count;
            }
            else if(num[i]==num[i-1])
            {
                continue;
            }
            else
            {
                count=1;
            }
        }
        return max;
    }
}
