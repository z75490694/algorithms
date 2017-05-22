package com.example.other;

/**
 * Created by WHZ on 2017/4/15.
 */
public class StrToInt {

    public static int StrToInt(String str) {
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int fuhao = 0;
        int sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[0] == '-'){
                fuhao = 1;
                continue;
            }
            else if (a[0] == '+'){
                fuhao = 0;
                continue;
            }
            else if (a[i] < 48 || a[i] > 57)
                return 0;
            sum = sum * 10 + a[i] - 48;
        }
        return fuhao == 0 ? sum : sum * -1;
    }
}
