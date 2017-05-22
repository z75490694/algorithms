package com.example.offer;

import java.util.ArrayList;

/**
 * Created by WHZ on 2017/4/6.
 */
public class offer28 {

    static ArrayList<String> res = new ArrayList<String>();
    String cur = new String();

    public ArrayList<String> Permutation(String str) {
        if(str==null) return null;
        boolean[] isUsed = new boolean[str.length()];
        permutationHelper(str,isUsed);
        return res;
    }
    public void permutationHelper(String str,boolean[] isUsed){
        if(cur.length()==str.length()){
            res.add(cur);
            return;
        }
        for(int i=0;i<str.length();i++){
            if(i>0&&str.charAt(i-1)==str.charAt(i)&&!isUsed[i-1]) continue; //如果字符串有重复
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
        String a = "abc";
        offer28 b = new offer28();
        b.Permutation(a);
        for (String str:
                res) {
            System.out.println(str);
        }
    }
}
