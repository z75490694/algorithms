package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer11 {

    double Power(double base,int exponent){
        if(base==0&&exponent<0){
            return 0.0;
        }
        int absExponent = exponent;
        if(exponent<0)
            absExponent = -exponent;
        double result = helper(base,absExponent);
        if(exponent<0)
            result = 1.0/result;
        return result;
    }

    private double helper(double base, int absExponent) {
        if(absExponent==0) return 1;
        if(absExponent==1) return base;
        double result = helper(base,absExponent>>1);
        result *=result;
        if((absExponent&1)==1){
            result *=base;
        }
        return result;
    }
}
