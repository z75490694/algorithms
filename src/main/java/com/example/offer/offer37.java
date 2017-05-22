package com.example.offer;

/**
 * Created by WHZ on 2017/4/7.
 */
public class offer37 {

    private class ListNode{
        ListNode next;
        int val;
    }

    ListNode FindFirstCommonNode(ListNode p1,ListNode p2){
        int length1 = GetListLength(p1);
        int length2 = GetListLength(p2);
        int lengthDif = length1-length2;
        ListNode pAhead = p1;
        ListNode pBehind = p2;
        if(length1<length2){
            lengthDif = length2-length1;
            pAhead = p2;
            pBehind = p1;
        }

        for(int i=0;i<lengthDif;i++){
            pAhead = pAhead.next;
        }

        while(pAhead!=null&&pBehind!=null&&pAhead!=pBehind){
            pAhead = pAhead.next;
            pBehind = pBehind.next;
        }

        return pAhead;

    }

    int GetListLength(ListNode head){
        int length = 0;
        ListNode node = head;
        while(node!=null){
            length++;
            node = node.next;
        }
        return length;
    }
}
