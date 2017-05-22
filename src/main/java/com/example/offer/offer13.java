package com.example.offer;

/**
 * Created by WHZ on 2017/3/31.
 */
public class offer13 {

    private class ListNode{
        int val;
        ListNode next;
    }
    void DeleteNode(ListNode pHead, ListNode pDelete){
        if(pHead==null||pDelete==null) return;
        if(pDelete.next!=null){
            ListNode pNext = pDelete.next;
            pDelete.val = pNext.val;
            pDelete.next = pNext.next;
        }else if(pHead==pDelete){
            pHead=null;
        }else{
            ListNode pNode = pHead;
            while(pNode.next!=pDelete){
                pNode=pNode.next;
            }
            pNode.next=null;
        }
    }
}
