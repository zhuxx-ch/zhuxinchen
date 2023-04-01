package org.cn.zhuxin.biz.activity.study.model;

import lombok.Data;

/**
 * 链表节点
 */
@Data
public class ListNode {
    /**
     * 当前节点的值
     */
    private int val;
    /**
     * 下一个节点
     */
    private ListNode next = null;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
