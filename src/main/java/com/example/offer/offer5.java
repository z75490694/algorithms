package com.example.offer;

import java.util.Stack;

/**
 * Created by WHZ on 2017/3/30.
 */
public class offer5 {

   private class ListNode{
       int val;
       ListNode next;
       public ListNode(int val){
           this.val = val;
       }
   }

   public void PrintListReversing(ListNode pHead){
       Stack<ListNode> nodes = new Stack<ListNode>();
       ListNode p = pHead;
       while(p!=null){
           nodes.push(p);
           p=p.next;
       }
       while(!nodes.isEmpty()){
           p = nodes.peek();
           System.out.println(p.val);
           nodes.pop();
       }

   }
}
