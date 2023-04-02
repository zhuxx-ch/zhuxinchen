package org.cn.zhuxin.biz.activity.study.broadview;

import org.cn.zhuxin.biz.activity.study.model.ListNode;

/**
 * 16. 合并两个排序的链表 【虚拟头结点】
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeListNode {
    public static ListNode merge(ListNode list1, ListNode list2){
        if(list1 == null && list2 == null){
            return null;
        }
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode mergeNode;
        int val = Math.min(list1.getVal(), list2.getVal());
        if (list1.getVal() <= list2.getVal()){
            mergeNode = new ListNode(val, merge(list1.getNext(), list2));
        }else {
            mergeNode = new ListNode(val, merge(list1, list2.getNext()));
        }
        return mergeNode;
    }
}
