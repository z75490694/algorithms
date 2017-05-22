package com.example.offer;

import java.util.ArrayList;

/**
 * Created by WHZ on 2017/3/23.
 */
public class offer50 {
    private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    boolean getNodePath(TreeNode root,TreeNode p,ArrayList<TreeNode> path){
        path.add(root);
        if(root == p){
            return true;
        }
        boolean found = false;
        while(!found && root!=null){
            if(root.left!=null) found = getNodePath(root.left,p,path);
            if(root.right!=null) found = getNodePath(root.right,p,path);
        }
        if(!found) path.remove(path.size()-1);
        return found;

    }
    TreeNode getLastCommonNode(ArrayList<TreeNode> path1,ArrayList<TreeNode> path2){
        int i = 0;
        TreeNode p1 = path1.get(i);
        TreeNode p2 = path1.get(i);
        TreeNode last = null;
        while(p1!=null&&p2!=null){
            if(p1==p2) last = p1;
            p1 = path1.get(++i);
            p2 = path1.get(++i);
        }
        return last;
    }

    TreeNode getLastCommonParent(TreeNode root,TreeNode p1,TreeNode p2){
        if(root==null||p1==null||p2==null) return null;
        ArrayList<TreeNode> path1 = new ArrayList<TreeNode>();
        ArrayList<TreeNode> path2 = new ArrayList<TreeNode>();
        getNodePath(root,p1,path1);
        getNodePath(root,p2,path2);
        return getLastCommonNode(path1,path2);
    }

}
