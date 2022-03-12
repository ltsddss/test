package com.lts.main;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

/**
 * 设计并实现一个算法，找出二叉树中某两个节点的第一个共同祖先。
 * 不得将其他的节点存储在另外的数据结构中。
 * 注意：这不一定是二叉搜索树。
 */
// 没通过，子树可能为空
public class Solution {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode re1=findroot(root,p);
        TreeNode re2=findroot(root,q);

        while (re1!=re2){
            re1=findroot(re1,p);
            re2=findroot(re2,q);
        }

        return re1;
    }

    public static TreeNode findroot(TreeNode root, TreeNode p) {
        if (root.left == p || root.right == p) {
            return root;
        } else {
            findroot(root.left, p);
            findroot(root.right,p);
        }
        return null;
    }

    public static void main(String[] args) {
    }
}
