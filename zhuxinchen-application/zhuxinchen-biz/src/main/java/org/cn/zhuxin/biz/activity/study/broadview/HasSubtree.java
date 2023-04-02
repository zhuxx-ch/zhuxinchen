package org.cn.zhuxin.biz.activity.study.broadview;

import org.cn.zhuxin.biz.activity.study.model.TreeNode;

/**
 * 17. 树的子结构 【大树每一个节点node，和子树的root进行匹配； 注意：N*if + return(|| &&)】
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubtree {
    public boolean hasSubTree(TreeNode root1, TreeNode root2){
        if (root1 == null || root2 == null){
            return false;
        }
        //父节点值一样，且左右子节点都匹配。root2的左右子节点可以为null
        if (root1.getVal() == root2.getVal()
                && isNodeEqual(root1.getLeft(),root2.getLeft())
                && isNodeEqual(root1.getRight(),root2.getRight())){
            return true;
        }
        //如果值一样，则看root2的左右子树是否都和root1一样，root2的左右子树可以为null
        return hasSubTree(root1.getLeft(), root2) || hasSubTree(root1.getRight(), root2);
    }

    /**
     * 判断node2与node1节点匹配：node2为空/值相同并且左右子节点都相同
     * @param node1
     * @param node2
     * @return
     */
    private boolean isNodeEqual(TreeNode node1, TreeNode node2){
        //root2的左右节点可以为空，也算匹配上
        if (node2 == null){
            return true;
        }
        //如果node1为null，正面树1比树2短，匹配不上
        if (node1 == null){
            return false;
        }
        if (node1.getVal() != node2.getVal()){
            return false;
        }
        return isNodeEqual(node1.getLeft(),node2.getLeft()) && isNodeEqual(node1.getRight(),node2.getRight());
    }
}
