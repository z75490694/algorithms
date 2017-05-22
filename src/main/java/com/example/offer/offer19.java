package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer19 {

    private class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }
    void MirrorRecursively(TreeNode pNode){
        if(pNode==null||(pNode.left==null&&pNode.right==null))
            return;
        TreeNode temp = pNode.left;
        pNode.left = pNode.right;
        pNode.right = temp;
        if(pNode.left!=null) MirrorRecursively(pNode.left);
        if(pNode.right!=null) MirrorRecursively(pNode.right);
    }
}
