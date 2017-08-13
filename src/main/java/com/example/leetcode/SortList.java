package com.example.leetcode;

/**
 * Created by WHZ on 2017/6/12.
 */
public class SortList {


    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = sortList(slow.next);
        slow.next = null;
        ListNode left = sortList(head);
        // /待左右两边各自有序，进行归并即可
        ListNode temp_head = new ListNode(0);
        ListNode temp_node = temp_head;
        while (left != null && right != null) {
            if (left.val < right.val) {
                temp_node.next = left;
                left = left.next;
            } else {
                temp_node.next = right;
                right = right.next;
            }
            temp_node = temp_node.next;
        }
        if (left != null)
            temp_node.next = left;
        if (right != null)
            temp_node.next = right;
        return temp_head.next;
    }
}
