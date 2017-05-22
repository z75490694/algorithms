package com.example.offer;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer39 {

    private class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
    int TreeDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        return left>right?left+1:right+1;
    }

    boolean IsBalanced(TreeNode root){
        if(root==null)
            return true;
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        int diff = left-right;
        if(diff>1||diff<-1)
            return false;
        return IsBalanced(root.left)&&IsBalanced(root.right);
    }
}
