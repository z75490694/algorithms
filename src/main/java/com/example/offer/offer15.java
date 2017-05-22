package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer15 {

    private class ListNode{
        int val;
        ListNode next;
    }
    ListNode FindKthToTail(ListNode pHead,int k){
        if(pHead==null || k==0) return null;
        ListNode pAhead = pHead;
        ListNode pBehind = null;
        for(int i=0;i<k-1;i++){
            if(pAhead.next!=null){
                pAhead=pAhead.next;
            }else {
                return null;
            }
        }
        pBehind = pHead;
        while(pAhead.next!=null){
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }
        return pBehind;
    }
}
