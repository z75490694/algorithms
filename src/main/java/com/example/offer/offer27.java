package com.example.offer;

/**
 * Created by WHZ on 2017/4/5.
 */
public class offer27 {

    private class BinaryTreeNode{
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;
    }

    BinaryTreeNode Convert(BinaryTreeNode pRootOfTree){
        BinaryTreeNode pLastNodeInList = ConvertNode(pRootOfTree);
        BinaryTreeNode pHeadOfList = pLastNodeInList;
        while(pHeadOfList!=null&&pHeadOfList.left!=null)
            pHeadOfList = pHeadOfList.left;
        return pHeadOfList;
    }

    private BinaryTreeNode ConvertNode(BinaryTreeNode pNode) {
        if(pNode == null)
            return null;
        BinaryTreeNode pLastNodeInList = null;
        if(pNode.left !=null)
            pLastNodeInList = ConvertNode(pNode.left);
        pNode.left = pLastNodeInList;
        if(pLastNodeInList !=null)
            pLastNodeInList.right = pNode;
        pLastNodeInList = pNode;
        if(pNode.right!=null)
            pLastNodeInList = ConvertNode(pNode.right);
        return pLastNodeInList;
    }
}
