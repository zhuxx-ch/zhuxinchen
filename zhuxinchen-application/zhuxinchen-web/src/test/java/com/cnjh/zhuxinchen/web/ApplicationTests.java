package com.cnjh.zhuxinchen.web;

import org.cn.zhuxin.biz.activity.study.broadview.*;
import org.cn.zhuxin.biz.activity.study.model.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        ListNode forth1 = new ListNode(7);
        ListNode third1 = new ListNode(5,forth1);
        ListNode second1 = new ListNode(3,third1);
        ListNode pHead1 = new ListNode(1,second1);
        ListNode forth2 = new ListNode(8);
        ListNode third2 = new ListNode(6,forth2);
        ListNode second2 = new ListNode(4,third2);
        ListNode pHead2 = new ListNode(2,second2);
        ListNode res = MergeListNode.merge(pHead1,pHead2);
        System.out.println(res.getVal());
    }
}
