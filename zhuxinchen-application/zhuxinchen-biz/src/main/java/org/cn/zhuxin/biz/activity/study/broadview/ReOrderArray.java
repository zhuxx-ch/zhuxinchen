package org.cn.zhuxin.biz.activity.study.broadview;

/**
 * 13. 调整数组顺序使奇数位于偶数前面 【保证顺序：新开空间；只区分奇偶：双指针】
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分
 * ，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    public static int[] reOrderArray (int[] array) {
        if (array == null || array.length == 0){
            return null;
        }
        int length = array.length;
        int[]  res = new int[length];
        int resIndex = 0;
        for (int j : array) {
            if (j % 2 == 1) {
                res[resIndex] = j;
                resIndex++;
            }
        }
        for (int j : array) {
            if (j % 2 == 0) {
                res[resIndex] = j;
                resIndex++;
            }
        }
        return res;
    }
}
