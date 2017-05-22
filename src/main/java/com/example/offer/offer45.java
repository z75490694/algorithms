package com.example.offer;

import java.util.ArrayList;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer45 {

    static int LastRemaining(int n,int m){
        if(n<1||m<1)
            return -1;
        int i=0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(i=0;i<n;i++)
            numbers.add(i);
        int current = 0;
        while(numbers.size()>1){
            for(i=1;i<m;i++){
                current++;
            }
            current = current%numbers.size();
            numbers.remove(current);
        }
        return numbers.get(0);
    }

    static int LastRemaining2(int n,int m){
        if(n<1||m<1)
            return -1;
        int last = 0;
        for(int i=2;i<=n;i++)
            last = (last+m)%i;
        return last;
    }

    public static void main(String[] args){
        int n = 10;
        int m = 7;
        System.out.println(LastRemaining(n,m));
        System.out.println(LastRemaining2(n,m));
    }
}
