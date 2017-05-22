package com.example.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by WHZ on 2017/5/18.
 */
public class WordBreak2 {

    public  static ArrayList<String> wordBreak(String s, Set<String> dict) {
        ArrayList<String> lists = new ArrayList<String>();
        ArrayList<String> strings = new ArrayList<String>();
        int start = 0;
        int length = s.length();
        dfs(s,start,length,dict,lists,strings);
        return lists;

    }

    public  static void dfs(String s,int start,int length,Set<String> dict, ArrayList<String> lists,ArrayList<String> strings) {
        if(start>=length){
            StringBuffer sb = new StringBuffer();
            for(int i=0;i<strings.size();i++){
                sb.append(strings.get(i));
                if(i!=strings.size()-1)
                    sb.append(" ");
            }
            lists.add(sb.toString());
        }
        for(int i=start;i<length;i++){
            if(dict.contains(s.substring(start,i+1))){
                strings.add(s.substring(start,i+1));
                dfs(s,i+1,length,dict,lists,strings);
                strings.remove(strings.size()-1);
            }
        }

    }

    public static void main(String[] args){
        String s = "catsanddog";
        Set<String> dict = new HashSet<String>();
        dict.add("cat");
        dict.add("cats");
        dict.add("and");
        dict.add("sand");
        dict.add("dog");
        ArrayList<String> result = wordBreak(s,dict);
        for(String temp:result){
            System.out.println(temp);

        }

    }
}
