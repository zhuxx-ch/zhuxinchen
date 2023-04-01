package org.cn.zhuxin.biz.activity.study.broadview;

import org.cn.zhuxin.biz.activity.study.model.ListNode;

/**
 * 14. 链表中倒数最后k个结点 【双指针，一个先走k步】，假设倒数第1个节点为链表最后1个节点
 * 输入一个链表，输出一个链表，该输出链表包含原链表中从倒数第k个结点至尾节点的全部节点。 如果该链表长度小于k，请返回一个长度为 0 的链表。
 */
public class FindKthToTail {
    public static ListNode FindKthToTail(ListNode pHead, int k) {
        if (pHead == null || k <= 0){
            return null;
        }
        ListNode frontPoint = pHead;
        ListNode behindPoint = pHead;
        //让前面的指针先走k-1步
        for (int step = 1; step <= k-1; step++){
            frontPoint = frontPoint.getNext();
            if (frontPoint == null){
                return null;
            }
        }
        //两个指针同时走，当前面的指针走到最后一个节点时，后面一个指针就在倒数第k个节点的位置
        while (frontPoint.getNext() != null){
            frontPoint = frontPoint.getNext();
            behindPoint = behindPoint.getNext();
        }
        return behindPoint;
    }
}
