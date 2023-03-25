package org.cn.zhuxin.biz.activity.study.broadview;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * 64. 滑动窗口的最大值
 *
 * 【队列L】==> 固定窗口宽，窗口里找1个max
 *
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。 窗口大于数组长度的时候，返回空。
 *
 * 【总体思路】采用双端队列ArrayDeque（LinkedList也可以），两端巧妙删除/增加；达到O(N)时间。
 */
public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayDeque<Integer> qmax = new ArrayDeque<Integer>(size);//qmax用于存序号i,而不是存num[i]里面的值。
        if(num==null || num.length < size || size<=0)return res;//不能是return null
        for(int i=0; i<=num.length-1; ++i){
            //1.右入qmax
            //【冒泡排序思想】qmax里面的值，左大右小。//去除num[i]左边相邻连续一排较小值。(新比旧大，旧必无用)
            while(qmax.peekLast()!=null && num[i] > num[qmax.peekLast()]){
                qmax.removeLast();
            }
            qmax.addLast(i);//最右边一格，而不一定和原先的连着??
            //2.左出qmax
            if(qmax.peekFirst() == i-size){
                qmax.removeFirst();//左框最左才会出  //不是 ==i-size+1
            }
            //3.res收当前max
            if(i>=size-1) {
                res.add(num[qmax.peekFirst()]);//最左边一定是当前的最大值，进入结果数组
            }
        }
        return res;
    }
}
