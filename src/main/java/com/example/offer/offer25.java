package com.example.offer;

import java.util.Stack;

/**
 * Created by WHZ on 2017/4/1.
 */
public class offer25 {

    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    void FindPath(TreeNode pRoot,int expectedSum){
        if(pRoot == null)
            return;
        Stack<Integer> path = new Stack<>();
        int currentSum = 0;
        FindPath(pRoot,expectedSum,path,currentSum);
    }

    private void FindPath(TreeNode pRoot, int expectedSum, Stack<Integer> path, int currentSum) {
        currentSum +=pRoot.val;
        path.push(pRoot.val);
        boolean isLeaf = pRoot.left==null&&pRoot.right==null;
        if(currentSum == expectedSum && isLeaf){
            for (Integer x : path) {
                System.out.print(x);
            }
            System.out.println();
        }
        if(pRoot.left!=null)
            FindPath(pRoot.left, expectedSum, path, currentSum);
        if(pRoot.right!=null)
            FindPath(pRoot.right, expectedSum, path, currentSum);

        currentSum-=pRoot.val;
        path.pop();
    }
}
