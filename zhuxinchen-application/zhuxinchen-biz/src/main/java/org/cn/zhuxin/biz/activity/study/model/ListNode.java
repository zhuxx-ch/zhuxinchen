package org.cn.zhuxin.biz.activity.study.model;

import lombok.Data;

@Data
public class ListNode {
    private int val;
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
