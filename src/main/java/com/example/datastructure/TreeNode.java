package com.example.datastructure;

/**
 * Created by WHZ on 2017/4/26.
 */
public class TreeNode<T>{
    public TreeNode(){
        data = 0;
        height = 0;
        freq = 1;
        left = null;
        right = null;
    }

    int data;
    int height;
    int freq;
    TreeNode<T> left;
    TreeNode<T> right;

}
