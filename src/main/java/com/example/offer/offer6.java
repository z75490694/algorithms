package com.example.offer;

/**
 * Created by WHZ on 2017/3/30.
 */
public class offer6 {

    static private class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

    static TreeNode Construct(int[] pre,int[] in){
        if (pre == null || in == null || pre.length == 0 || in.length == 0){
            return null;
        }
        return ConstructCore(pre,in,0,pre.length-1,0,in.length-1);
    }

    static TreeNode ConstructCore(int[] pre,int[] in,int startPre,int endPre,int startIn,int endIn){
        int val = pre[startPre];
        TreeNode root = new TreeNode();
        root.val = val;
        root.left=root.right=null;
        if(startPre==endPre){
            if(startIn==endIn&&in[startIn]==pre[startPre]){
                return root;
            }
            else return null;
        }
        int rootInorder = startIn;
        while(in[rootInorder]!=val&&rootInorder<=endIn){
            rootInorder++;
        }
        if(rootInorder==endIn&&in[rootInorder]!=val){
            return null;
        }
        int leftLength = rootInorder-startIn;
        int leftPreOrderEnd = startPre+leftLength;
        if(leftLength>0){
            root.left = ConstructCore(pre,in,startPre+1,leftPreOrderEnd,startIn,rootInorder-1);
        }
        if(leftLength<endPre-startPre){
            root.right = ConstructCore(pre,in,leftPreOrderEnd+1,endPre,rootInorder+1,endIn);
        }
        return root;
    }

    public static void main(String args[]){
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode root = Construct(pre,in);
        System.out.println(root.val+" "+root.left.val+" "+root.right.val);
    }
}
