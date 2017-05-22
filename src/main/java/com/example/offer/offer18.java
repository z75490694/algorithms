package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer18 {

    private class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
    }

    boolean HasSubtree(TreeNode pRoot1,TreeNode pRoot2){
        boolean result = false;
        if(pRoot1!=null&&pRoot2!=null){
            if(pRoot1.val==pRoot2.val)
                result = DoesTree1HavaTree2(pRoot1,pRoot2);
            if(!result)
                result = HasSubtree(pRoot1.left,pRoot2);
            if(!result)
                result = HasSubtree(pRoot1.right,pRoot2);
        }
        return result;
    }

    private boolean DoesTree1HavaTree2(TreeNode pRoot1, TreeNode pRoot2) {
        if(pRoot2==null) return true;
        if(pRoot1==null) return false;
        if(pRoot1.val!=pRoot2.val) return false;
        return DoesTree1HavaTree2(pRoot1.left,pRoot2.left)
                &&DoesTree1HavaTree2(pRoot1.right,pRoot2.right);

    }
}
