package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/12.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode fast=head;
        ListNode low=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            low=low.next;
            if(fast==low){
                return true;
            }

        } return false;
    }
}
