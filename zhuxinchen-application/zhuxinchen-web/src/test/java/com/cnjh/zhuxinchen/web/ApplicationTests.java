package com.cnjh.zhuxinchen.web;

import org.cn.zhuxin.biz.activity.study.broadview.*;
import org.cn.zhuxin.biz.activity.study.model.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
//        ListNode third = new ListNode(3);
//        ListNode second = new ListNode(2,third);
        ListNode pHead = new ListNode(1);
        ListNode res = ReverseList.ReverseList(pHead);
        System.out.println(res.getVal());
    }
}
