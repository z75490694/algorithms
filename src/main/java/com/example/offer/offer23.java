package com.example.offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by WHZ on 2017/4/1.
 */
public class offer23 {

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    void PrintFromTopToBottom(TreeNode root){
        if(root==null) return;
        Queue<TreeNode> qTreeNode = new LinkedList<>();
        qTreeNode.add(root);
        while(!qTreeNode.isEmpty()){
            TreeNode p = qTreeNode.poll();
            System.out.print(" "+p.val);
            if(p.left!=null) qTreeNode.add(p.left);
            if(p.right!=null) qTreeNode.add(p.right);
        }
    }

}
