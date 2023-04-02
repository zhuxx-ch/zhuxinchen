package org.cn.zhuxin.biz.activity.study.model;

import lombok.Data;

/**
 * 二叉树
 */
@Data
public class TreeNode {
    /**
     * 当前节点的值
     */
    private int val;
    /**
     * 左子节点
     */
    private TreeNode left;
    /**
     * 右子节点
     */
    private TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
