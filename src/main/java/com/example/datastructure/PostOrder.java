package com.example.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by WHZ on 2017/4/15.
 */
public class PostOrder {

    private static class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int val){
            this.val = val;
        }
    }

    private static class SA{
        TreeNode R;
        int tag;
        SA(TreeNode R, int tag){
            this.R = R;
            this.tag = tag;
        }
    }

    static void PostOrder(TreeNode root){
        Stack<SA> s = new Stack<>();
        //SA a = new SA();
        do{
            while(root!=null){
                s.add(new SA(root,1));
                root=root.left;
            }
            while(!s.isEmpty()&&s.peek().tag==2){

                System.out.print(s.peek().R.val);
                s.pop();
            }
            if(!s.isEmpty()&&s.peek().tag==1){
                root = s.peek().R.right;
                s.peek().tag=2;
            }

        }while(!s.isEmpty());
        /*while(!s.isEmpty()||root!=null){
            if(root!=null) {
                // System.out.print(root.val);
                s.add(root);

                root = root.left;
            }
            else{
                root = s.pop();
                System.out.print(root.val);
                root = root.right;
            }
        }*/
    }

    static void PreOrder(TreeNode root){
        Stack<SA> s = new Stack<>();
        do{
            while(root!=null){
                System.out.print(root.val);
                s.add(new SA(root,1));
                root = root.left;
            }
            while(!s.isEmpty()&&s.peek().tag==2){
                s.pop();
            }
            if(!s.isEmpty()&&s.peek().tag==1){
                root = s.peek().R.right;
                s.peek().tag=2;
            }

        }while(!s.isEmpty());
    }

    static void InOrder(TreeNode root){
        Stack<SA> s = new Stack<>();
        do{
            while(root!=null){

                s.add(new SA(root,1));
                root = root.left;
            }
            while(!s.isEmpty()&&s.peek().tag==2){
                s.pop();
            }
            if(!s.isEmpty()&&s.peek().tag==1){
                System.out.print(s.peek().R.val);
                root = s.peek().R.right;
                s.peek().tag=2;

            }

        }while(!s.isEmpty());
    }

    static void LevelOrder(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        if (root!=null){
            q.add(root);
        }
        while (!q.isEmpty()){
            TreeNode cur = q.poll();
            System.out.print(cur.val);
            if(cur.left!=null) q.add(cur.left);
            if(cur.right!=null) q.add(cur.right);
        }
    }

    static void ReverseLevelOrder(TreeNode root){
        Stack<TreeNode> s = new Stack<>();
        addTreeNodeInStack(s,root);
        while (!s.isEmpty()){
            System.out.print(s.pop().val);
        }

    }

    static void addTreeNodeInStack(Stack<TreeNode> s,TreeNode root){
        if(root!=null){
            s.add(root);
            addTreeNodeInStack(s,root.right);
            addTreeNodeInStack(s,root.left);
        }
    }

    public static void main(String[] args) {

        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        ReverseLevelOrder(a);
    }
}
