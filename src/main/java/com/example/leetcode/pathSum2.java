package com.example.leetcode;

import java.util.ArrayList;

/**
 * Created by WHZ on 2017/6/19.
 */
public class pathSum2 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        paths(root, sum, list);
        return res;
    }
    private void paths(TreeNode root, int sum, ArrayList<Integer> list){
        if(root == null)
            return;
        if(root.left == null && root.right == null && sum - root.val == 0){
            list.add(root.val);
            res.add(new ArrayList<Integer>(list));
            list.remove(list.size() - 1);
            return;
        }
        list.add(root.val);
        paths(root.left, sum - root.val, list);
        paths(root.right, sum - root.val, list);
        list.remove(list.size() - 1);
    }
}
