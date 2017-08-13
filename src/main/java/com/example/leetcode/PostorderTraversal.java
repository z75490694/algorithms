package com.example.leetcode;

import com.example.datastructure.PostOrder;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by WHZ on 2017/6/8.
 */
public class PostorderTraversal {

    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
  }

    public static ArrayList<Integer> postorderTraversal(TreeNode root){
        TreeNode p = root, r = null;        //P记录当前节点，r用来记录上一次访问的节点
        Stack<TreeNode> s = new Stack<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(p != null || !s.isEmpty()) {
            if(p != null) {     //左孩子一直入栈，直到左孩子为空
                s.push(p);
                p = p.left;
            } else {
                p = s.peek();
                p = p.right;
                if(p != null && p != r) {   //如果栈顶元素的右孩子不为空，且未被访问过
                    s.push(p);              //则右孩子进栈，然后重复左孩子一直进栈直到为空的过程
                    p = p.left;
                } else {
                    p = s.pop();            //否则出栈，访问，r记录刚刚访问的节点
                    list.add(p.val);
                    r = p;
                    p = null;
                }
            }
        }
        return list;
    }

    public static void main(String[] args){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        a.right = b;
        b.left = c;
        ArrayList<Integer> result = postorderTraversal(a);
        for (Integer i:result) {
            System.out.print(i);
        }
    }
}
