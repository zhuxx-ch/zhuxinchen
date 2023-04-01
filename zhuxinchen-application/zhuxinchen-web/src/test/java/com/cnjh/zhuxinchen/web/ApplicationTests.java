package com.cnjh.zhuxinchen.web;

import org.cn.zhuxin.biz.activity.study.broadview.CutRope;
import org.cn.zhuxin.biz.activity.study.broadview.Fibonacci;
import org.cn.zhuxin.biz.activity.study.broadview.NumberOf1;
import org.cn.zhuxin.biz.activity.study.broadview.ReOrderArray;
import org.cn.zhuxin.biz.activity.study.leetcode.AddTwoNumbers;
import org.cn.zhuxin.biz.activity.study.leetcode.LengthOfLongestSubstring;
import org.cn.zhuxin.biz.activity.study.leetcode.LongestPalindrome;
import org.cn.zhuxin.biz.activity.study.model.ListNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        int[]  array = new int[]{1,3,5,6,2,33,7};
        int[] res = ReOrderArray.reOrderArray(array);
        System.out.println(res);
    }
}
