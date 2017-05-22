package com.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by WHZ on 2017/5/18.
 */
public class WordBreak {

    public static boolean wordBreak(String s, Set<String> dict) {
        if(dict.size()==0||s.length()==0) return false;
        int len = s.length();
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i=1;i<len+1;i++){
            for(int j=i-1;j>=0;j--){
                if(dp[j]&&dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args){
        String s = "leetcode";
        Set<String> dict = new HashSet<String>();
        dict.add("leet");
        dict.add("code");
        boolean result = wordBreak(s,dict);
        System.out.print(result);
    }
}
