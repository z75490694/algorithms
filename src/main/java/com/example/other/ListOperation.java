package com.example.other;

/**
 * Created by WHZ on 2017/4/15.
 */
public class ListOperation {
    private class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val=val;
        }

    }

    public ListNode reverse(ListNode p){
        if(p==null||p.next==null) return p;
        ListNode cur = null;
        while(p!=null){
            ListNode tmp = p.next;
            p.next = cur;
            cur = p;
            p = tmp;
        }
        return cur;
    }

    public boolean isExistLoop(ListNode p){
        ListNode fast = p;
        ListNode slow = p;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        return fast!=null&&fast.next!=null;

    }

    public ListNode loopLocation(ListNode p){
        ListNode fast = p;
        ListNode slow = p;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        if(fast!=null&&fast.next!=null){
            slow = p;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
