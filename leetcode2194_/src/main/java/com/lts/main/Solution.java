package com.lts.main;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /**
     * 通过
     * @param s 一个格式的字符串
     * @return 返回一个String列表
     */
    public List<String> cellsInRange(String s) {

//        创建一个List数组
        List<String> result=new ArrayList<>();
//        将字符串转为字符数组
        char[] ss=s.toCharArray();
//        双重遍历判断大小
        for (char i = ss[0]; i <=ss[3]; i++) {
            for (char j =ss[1] ; j <=ss[4] ; j++) {
                //        存入列表
                result.add(i+""+j);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.cellsInRange("A1:F2"));
    }
}
