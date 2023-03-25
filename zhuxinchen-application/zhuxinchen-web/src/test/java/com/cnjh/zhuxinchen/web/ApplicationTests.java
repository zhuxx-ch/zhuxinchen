package com.cnjh.zhuxinchen.web;

import org.cn.zhuxin.biz.activity.study.broadview.CutRope;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
        CutRope cutRope = new CutRope();
        int max = cutRope.cutRope(20);
        System.out.println(max);
    }
}
