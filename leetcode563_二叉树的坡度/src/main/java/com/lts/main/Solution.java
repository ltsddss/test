package com.lts.main;

//      使用深度优先搜索的算法实现
public class Solution {

    int ans=0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }

    public int dfs(TreeNode node){
        if(node==null){
            return 0;
        }
        int sumleft=dfs(node.left);
        int sumright=dfs(node.right);

        ans+=Math.abs(sumleft-sumright);

        return sumleft+sumright+node.val;
    }
}
