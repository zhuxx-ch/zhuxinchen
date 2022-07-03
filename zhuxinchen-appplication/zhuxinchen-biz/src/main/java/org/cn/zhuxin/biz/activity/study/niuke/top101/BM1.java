package org.cn.zhuxin.biz.activity.study.niuke.top101;

import org.cn.zhuxin.biz.activity.study.model.ListNode;

/**
 * 反转链表
 */
public class BM1 {

    public static ListNode reverseList(ListNode head){
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

    public static void main(String[] args){
        try {
            ListNode last = new ListNode(3,null);
            ListNode second = new ListNode(2,last);
            ListNode head = new ListNode(1,second);
            ListNode revert = reverseList(head);
            System.out.println(revert);
        }catch (Throwable t){
            System.out.println(t);
        }
    }
}
