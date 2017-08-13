package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/13.
 */
public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        return sumNumbers(root,0);
    }
    public int sumNumbers(TreeNode root,int sum){
        if(root==null)return 0;
        sum=sum*10+root.val;
        if(root.left==null&&root.right==null){

            return sum;
        }
        return sumNumbers(root.left,sum)+sumNumbers(root.right,sum);
    }
}
