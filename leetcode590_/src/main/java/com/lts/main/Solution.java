package com.lts.main;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 返回参数的一个后续遍历的数组
     * @param root 根节点
     * @return 后续遍历的数组
     */
    public List<Integer> postorder(Node root) {

//        只需要进行后续遍历即可

        List<Integer> result=new ArrayList<>();

//        DFS深度优先遍历
        DFS(root,result);

        return result;


    }

//    使用深度优先遍历来遍历到最深的左子树，再遍历右子树最后加上根节点
    public void DFS(Node node,List<Integer> result){
        if(node==null){
//            无节点时返回空
            return;
        }
        for (int i = 0; i <node.children.size() ; i++) {
            DFS(node.children.get(i),result);
        }

//        追加当前的节点
        result.add(node.val);

    }
}
