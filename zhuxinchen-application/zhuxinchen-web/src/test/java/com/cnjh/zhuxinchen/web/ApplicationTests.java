package com.cnjh.zhuxinchen.web;

import org.cn.zhuxin.biz.activity.study.broadview.*;
import org.cn.zhuxin.biz.activity.study.model.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        ListNode next1 = new ListNode(2);
        ListNode pHead = new ListNode(1,next1);
        ListNode res = FindKthToTail.FindKthToTail(pHead,2);
        System.out.println(res.getVal());
    }
}
