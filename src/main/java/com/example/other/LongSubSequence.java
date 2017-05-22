package com.example.other;

/**
 * Created by WHZ on 2017/4/15.
 */
public class LongSubSequence {

    private static int longSubsequence(int[] r){
        if(r.length==0) return 0;
        int ans = 0;
        int []dp = new int[r.length];
        for(int i=0;i<r.length;i++){
            dp[i] = 0;
        }
        for(int i=0;i<r.length;i++){
            ans = dp[i];
            for(int j=0;j<i;j++){
                if(r[i]>r[j]&&dp[j]>ans){
                    ans = dp[j];
                }
            }
            dp[i] = ans+1;
        }

        for(int i=0;i<dp.length;i++){
            if(dp[i]>ans){
                ans = dp[i];
            }
        }
        return ans;
    }
}
