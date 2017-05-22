package com.example.datastructure;

import com.example.other.StaticInner;

/**
 * Created by WHZ on 2017/4/23.
 */
public class BinarySearchTree {

    static private class BiNode{
        int val;
        BiNode left;
        BiNode right;
        public BiNode(int val){
            this.val = val;
        }
    }

    static BiNode Search(BiNode root,int key){
        while(root!=null){
            if(root.val>key){
                root = root.left;
            }else if(root.val<key){
                root = root.right;
            }else{
                return root;
            }
        }
        return null;
    }

    static void InsertBST(BiNode root,BiNode s){
        BiNode parent;
        do{
            parent = root;
            if(root.val>s.val){
                root = root.left;
            }else{
                root = root.right;
            }
        }while (root!=null);
        if(parent.val>s.val){
            parent.left = s;
        }else{
            parent.right = s;
        }
    }

    static void Create(BiNode root,int[] a){
        for(int i=0;i<a.length;i++){
            BiNode s = new BiNode(a[i]);
            s.left=s.right=null;
            InsertBST(root,s);
        }
    }

    static void Delete(BiNode r){
        if(r.left==null) r = r.right;
        else if(r.right==null) r = r.left;
        else{
            BiNode q,s;
            q = r;
            s = r.left;
            while(s.right!=null){
                q = s;
                s = s.right;
            }
            r.val = s.val;
            if(q!=r){
                q.right = s.left;
            }else{
                r.left = s.left;
            }
        }
    }

    static boolean DeleteBST(BiNode r,int key){
        if(r==null) return false;
        else{
            if(r.val==key) Delete(r);
            else if(r.val>key) DeleteBST(r.left,key);
            else DeleteBST(r.right,key);
            return true;
        }
    }

    public static void main(String[] args){
        int[] a = {12,31,23,1,23,1231,2,3,12,3,12,3,12,3,13,4,2,34,24,45,56};
        BiNode r = new BiNode(a[0]);
        r.left=r.right=null;
        Create(r,a);
        BiNode s = Search(r,23);
        if(s!=null){
            System.out.print("find");
        }else{
            System.out.print("no find");
        }
        boolean delete = DeleteBST(r,23);
        if(!delete){
            System.out.print("find");
        }else{
            System.out.print("no find");
        }
    }

}
