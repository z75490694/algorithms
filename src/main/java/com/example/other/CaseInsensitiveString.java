package com.example.other;

/**
 * Created by WHZ on 2017/4/17.
 */
public class CaseInsensitiveString {



    String s;

    public CaseInsensitiveString(String s){
        this.s = s;
    }

    @Override
    public boolean equals(Object a){
        System.out.print("equals");
        CaseInsensitiveString b;
        if(a instanceof CaseInsensitiveString ){
            b = (CaseInsensitiveString)a;
        }else{
            return false;
        }
        if(s.length()!=b.s.length()){
            return false;
        }
        for(int i=0;i<b.s.length();i++){
            if(s.toUpperCase().charAt(i)!=b.s.toUpperCase().charAt(i)){
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode(){
        //该方法会在hashmap里调用，比如hashmap.put(CaseInsensitiveString,int),则会计算CaseInsensitiveString的hashcode值。
        String c = s.toUpperCase();
        System.out.println(c.hashCode());
        return c.hashCode();
    }
}
