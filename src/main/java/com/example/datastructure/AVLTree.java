package com.example.datastructure;

import sun.reflect.generics.tree.Tree;

import java.util.Comparator;

/**
 * Created by WHZ on 2017/4/26.
 */
public class AVLTree<T> {



    //插入
    private TreeNode<T> insertpri(TreeNode<T> root,TreeNode<T> node){
        if (root==null){
            return node;
        }
        if(root.data > node.data){
            root.left = insertpri(root.left,node);
            if(height(root.left)-height(root.right) == 2){
                if(root.left.data > node.data)     //左左情况
                    root = SingRotateLeft(root);
                else                                    //左右情况
                    root = DoubleRotateLR(root);
            }
        }else{
            root.right = insertpri(root.right,node);
           if(height(root.right)-height(root.left) == 2){
                if(root.right.data > node.data)        //右左情况
                    root = DoubleRotateRL(root);
                else                                        //右右情况
                    root = SingRotateRight(root);
            }
        }
        //完了之后更新height值
        root.height = Math.max(height(root.left), height(root.right))+1;
        return root;
    }

    //查找
    private TreeNode<T> findpri(TreeNode<T> node,int x){
        if(node==null)//如果节点为空说明没找到,返回NULL
        {
            return null;
        }
        if(node.data>x)//如果x小于节点的值,就继续在节点的左子树中查找x
        {
            return findpri(node.left,x);
        }
        else if(node.data<x)//如果x大于节点的值,就继续在节点的左子树中查找x
        {
            return findpri(node.right,x);
        }
        else return node;
    }

    //中序遍历
    private void insubtree(TreeNode<T> node){
        if (node!=null){
            insubtree(node.left);//先遍历左子树
            System.out.print(node.data);//输出根节点
            insubtree(node.right);//再遍历右子树
        }

    }

    //删除
    private void Deletepri(TreeNode<T> node,int x){

    }

    //求树的高度
    private int height(TreeNode<T> node){
        if (node!=null)
            return node.height;
        return -1;
    }

    //左左情况下的旋转
    private TreeNode<T> SingRotateLeft(TreeNode<T> k2){
        TreeNode<T> k1;
        k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;

        k2.height = Math.max(height(k2.left),height(k2.right))+1;
        k1.height = Math.max(height(k1.left),k2.height)+1;
        return k1;

    }

    //右右情况下的旋转
    private TreeNode<T> SingRotateRight(TreeNode<T> k2){
        TreeNode<T> k1;
        k1 = k2.right;
        k2.right = k1.left;
        k1.left = k2;

        k2.height = Math.max(height(k2.left),height(k2.right))+1;
        k1.height = Math.max(height(k1.right),k2.height)+1;
        return k1;
    }

    //左右情况下的旋转
    private TreeNode<T> DoubleRotateLR(TreeNode<T> k3){
        k3.left = SingRotateRight(k3.left);
        return SingRotateLeft(k3);
    }


    //右左情况下的旋转
    private  TreeNode<T> DoubleRotateRL(TreeNode<T> k3){
        k3.right = SingRotateLeft(k3.right);
        return SingRotateRight(k3);
    }



    public static void main(String[] args){
        TreeNode<Integer> root = new TreeNode<>();
        AVLTree<Integer> avl = new AVLTree<>();
        root.data=0;

        for(int i=1;i<10;i++){
            TreeNode<Integer> s = new TreeNode<>();
            s.data = i;
            s.left = s.right = null;
            root = avl.insertpri(root,s);
        }
        avl.insubtree(root);
        System.out.println();
        System.out.println(avl.height(root));
    }



}
