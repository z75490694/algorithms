package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer17 {

    private class ListNode{
        int val;
        ListNode next;
    }

    ListNode Merge(ListNode pHead1,ListNode pHead2){
        if(pHead1==null) return pHead2;
        else if(pHead2==null) return pHead1;
        ListNode pMergedHead = null;
        if(pHead1.val<pHead2.val){
            pMergedHead=pHead1;
            pMergedHead.next=Merge(pHead1.next,pHead2);
        }else {
            pMergedHead=pHead2;
            pMergedHead.next=Merge(pHead1,pHead2.next);
        }
        return pMergedHead;
    }
}
