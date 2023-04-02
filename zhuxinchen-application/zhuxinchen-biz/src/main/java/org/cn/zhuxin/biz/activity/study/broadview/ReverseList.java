package org.cn.zhuxin.biz.activity.study.broadview;

import org.cn.zhuxin.biz.activity.study.model.ListNode;

/**
 * 15. 反转链表 【三指针法】
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {
    public static ListNode ReverseList(ListNode head){
        if (head == null){
            return null;
        }
        ListNode reverseList = null;
        ListNode currentNode = head;
        ListNode tmpNode = null;
        while (currentNode != null){
            tmpNode = currentNode.getNext();
            currentNode.setNext(reverseList);
            reverseList = currentNode;
            currentNode = tmpNode;
        }
        return reverseList;
    }
}
