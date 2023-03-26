package com.cnjh.zhuxinchen.web;

import org.cn.zhuxin.biz.activity.study.broadview.CutRope;
import org.cn.zhuxin.biz.activity.study.leetcode.AddTwoNumbers;
import org.cn.zhuxin.biz.activity.study.model.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        //输入：l1 = [2,4,3], l2 = [5,6,4]
        //输出：[7,0,8]
        ListNode l1_3 = new ListNode(3);
        ListNode l1_2 = new ListNode(4,l1_3);
        ListNode l1 = new ListNode(2,l1_2);
        ListNode l2_3 = new ListNode(4);
        ListNode l2_2 = new ListNode(6,l2_3);
        ListNode l2 = new ListNode(5,l2_2);
        addTwoNumbers.addTwoNumbers(l1,l2);
    }
}
