package org.cn.zhuxin.biz.activity.study.niuke.top101;

import org.cn.zhuxin.biz.activity.study.model.ListNode;

/**
 * 反转链表
 */
public class BM1 {

    public ListNode reverseList(ListNode head){
        if (head == null){
            return null;
        }
        if (head.getNext() == null){
            return head;
        }
        ListNode next = head.getNext();
        head.setNext(null);
        ListNode current = new ListNode(head.getVal(),head.getNext());
        while (true){
            if (next.getNext() == null){
                next.setNext(current);
                break;
            }
            ListNode tmpNext = next.getNext();
            next.setNext(current);
            current = new ListNode(next.getVal(),next.getNext());
            next = new ListNode(tmpNext.getVal(),tmpNext.getNext());
        }
        return next;
    }
}
