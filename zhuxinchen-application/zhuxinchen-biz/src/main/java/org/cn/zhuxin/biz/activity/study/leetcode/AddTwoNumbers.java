package org.cn.zhuxin.biz.activity.study.leetcode;

import org.cn.zhuxin.biz.activity.study.model.ListNode;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {
    int jump = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null){
            return null;
        }
        ListNode resHead = new ListNode();
        ListNode res = resHead;
        int add = 0;
        while(true){
            if(l1 == null || l2 == null){
                res.setNext(null);
                if(jump > 0){
                    res.setVal(jump);
                }
                break;
            }
            add = this.add(l1,l2,jump);
            res.setVal(add);
            res.setNext(new ListNode());
            res = res.getNext();
            if(l1 == null){
                l1 = null;
            }else{
                l1 = l1.getNext();
            }
            if(l2 == null){
                l2 = null;
            }else{
                l2 = l2.getNext();
            }
        }
        return resHead;
    }

    private int add(ListNode l1Current, ListNode l2Current, int jump){
        int intL1 = 0;
        int intL2 = 0;
        if(l1Current != null){
            intL1 = l1Current.getVal();
        }
        if(l2Current != null){
            intL2 = l2Current.getVal();
        }
        int res = 0;
        int add = intL1 + intL2 + jump;
        if( add > 9){
            res = add % 10;
            this.jump = 1;
        }else{
            res = add;
            this.jump = 1;
        }
        return res;
    }
}
