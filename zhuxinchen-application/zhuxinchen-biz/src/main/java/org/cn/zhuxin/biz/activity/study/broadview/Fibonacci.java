package org.cn.zhuxin.biz.activity.study.broadview;


/**
 * 07. 斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。n≤39
 */
public class Fibonacci {

    public int fibonacci(int n){
        int[] fib = new int[40];
        fib[0] = 0;
        fib[1] = 1;
        for (int index = 2; index <= n ;index++){
            fib[index] = fib[index-1] + fib[index-2];
        }
        return fib[n];
    }
}
