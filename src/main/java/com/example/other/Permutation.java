package com.example.other;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by WHZ on 2017/4/15.
 */
public class Permutation {

    static ArrayList<String> res = new ArrayList<String>();
    static String cur = new String();
    public static ArrayList<String> Permutation(String str) {
        if(str==null) return null;
        boolean[] isUsed = new boolean[str.length()];
        permutationHelper(str,isUsed);
        return res;
    }
    public static void permutationHelper(String str,boolean[] isUsed){
        if(cur.length()==str.length()){
            res.add(cur);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(i>0&&str.charAt(i-1)==str.charAt(i)&&!isUsed[i-1]) continue;
            if(!isUsed[i]){
                cur = cur+str.charAt(i);
                isUsed[i] = true;
                permutationHelper(str,isUsed);
                cur = cur.substring(0,cur.length()-1);
                isUsed[i] = false;
            }
        }
    }

    public static void main(String[] args){
        String s ="AABB";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        s = String.valueOf(c);
        Permutation(s);
        for(String a:res){
            System.out.println(a);
        }
    }
}
