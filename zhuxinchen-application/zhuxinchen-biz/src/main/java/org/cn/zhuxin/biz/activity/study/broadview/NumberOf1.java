package org.cn.zhuxin.biz.activity.study.broadview;

/**
 * 11. 二进制中1的个数【0x01按位与】
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1 {
    public static int numberOf1(int n){
        int count = 0;
        int flag = 0b01;
        while (flag <= n){
            if ((n & flag) != 0){
                count++;
            }
            flag = flag<<1;
        }
        return count;
    }
}
