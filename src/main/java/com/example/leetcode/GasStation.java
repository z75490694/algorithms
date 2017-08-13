package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/12.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0;i<gas.length;i++){
            int gas_num=0,cost_num=0;
            int k=0;
            for(int j = i;k<gas.length;j++,k++){
                if(j==gas.length){
                    j=0;
                }
                gas_num+=gas[j];
                cost_num+=cost[j];
                if(gas_num<cost_num)
                {
                    break;
                }
            }
            if (k==gas.length) {
                return i;
            }
        }
        return -1;
    }
}
