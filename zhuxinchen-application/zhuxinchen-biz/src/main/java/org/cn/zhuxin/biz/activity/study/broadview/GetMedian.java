package org.cn.zhuxin.biz.activity.study.broadview;

import java.util.PriorityQueue;

/**
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 * 我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 *
 * 【总体思路】设立一个大根堆、一个小根堆，还有一个奇偶标记。 大根堆保存较小的半边，小根堆大的半边；入堆来回倒（以保证中位）、出堆类型转换
 */
public class GetMedian {
    PriorityQueue<Integer> minRootHeap = new PriorityQueue<Integer>();//小根堆
    PriorityQueue<Integer> maxRootHeap = new PriorityQueue<Integer>((x,y) -> y-x);//大根堆：用lambda表达式 调整顺序
    boolean isOdd = false;//可以设置boolean,也可以设置一个Int类型的++i
    //3个全局（类）变量，空间复杂度O(N)

    public void Insert(Integer num) {
        if(isOdd == false){
            minRootHeap.add(num);//插入小根堆  //由于是中位数，所以是对称的，反过来也可
            maxRootHeap.add(minRootHeap.poll());//小根堆最小值，给到大根堆
        }
        else{
            maxRootHeap.add(num);
            minRootHeap.add(maxRootHeap.poll());
        }
        isOdd = !isOdd;
    }//时间O(logN) 空间O(1)

    public Double GetMedian() {//输出的类型是Double
        if(isOdd == true){
            return maxRootHeap.peek() / 1.0;//【强制转换】成Double
        }
        else{
            return (maxRootHeap.peek() + minRootHeap.peek()) / 2.0;
        }
    }//时间O(1) 空间O(1)
}
