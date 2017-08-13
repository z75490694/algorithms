package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/8.
 */
public class MinimumDepth {

    public int predepth(TreeNode root){
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return predepth(root.right)+1;
        }
        if(root.right==null){
            return predepth(root.left)+1;
        }
        return Math.min(predepth(root.left),predepth(root.right))+1;
    }
    public int run(TreeNode root) {
        return predepth(root);
    }
}
