package com.example.offer;

/**
 * Created by WHZ on 2017/4/5.
 */
public class offer26 {

    private class ComplexListNode{
        int val;
        ComplexListNode next;
        ComplexListNode sibling;
    }

    void CloneNodes(ComplexListNode pHead){
        ComplexListNode pNode = pHead;
        while(pNode!=null){
            ComplexListNode pCloned = new ComplexListNode();
            pCloned.next = pNode.next;
            pCloned.sibling = null;
            pNode.next = pCloned;
            pNode = pCloned.next;
        }
    }

    void ConnectSiblingNodes(ComplexListNode pHead){
        ComplexListNode pNode = pHead;
        while(pNode!=null){
            ComplexListNode pCloned = pNode.next;
            if(pNode.sibling!=null){
                pCloned.sibling = pNode.sibling.next;
            }
            pNode = pCloned.next;
        }
    }

    ComplexListNode ReconnectNodes(ComplexListNode pHead){
        ComplexListNode pNode = pHead;
        ComplexListNode pClonedHead = null;
        ComplexListNode pClonedNode = null;
        if(pNode!=null){
            pClonedHead = pClonedNode = pNode.next;
            pNode.next = pClonedNode.next;
            pNode = pNode.next;
        }

        while(pNode!=null){
            pClonedNode.next = pNode.next;
            pClonedNode = pClonedNode.next;
            pNode.next = pClonedNode.next;
            pNode = pNode.next;
        }

        return pClonedHead;
    }

    ComplexListNode Clone(ComplexListNode pHead){
        CloneNodes(pHead);
        ConnectSiblingNodes(pHead);
        return ReconnectNodes(pHead);
    }
}
