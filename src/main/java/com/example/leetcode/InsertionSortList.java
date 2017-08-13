package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/12.
 */
public class InsertionSortList {


    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next== null)
            return head;
        ListNode root = new ListNode(0); // 头结点
        root.next = head;
        ListNode p = head;
        ListNode q;
        ListNode r;

        while (p != null && p.next != null) {
            if (p.val <= p.next.val) {
                p = p.next;
            }else {
                q = p.next;
                p.next = q.next;

                r = root;
                // 找第一个大于等于q.val的前驱结点，因为在root.next到p之间必定存在这样的结点
                while (r.next.val <= q.val) {
                    r = r.next;
                }

                q.next = r.next;
                r.next = q;
            }
        }

        return root.next;

    }
}
