package com.lts.main;


/**
 * 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 进阶：不要 使用任何内置的库函数，如  sqrt 。
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        //使用内置的库函数解法
        return (int)Math.sqrt(num)*Math.sqrt(num)==num;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        for (int i = 0; i <100 ; i++) {
            System.out.println(i+":"+s.isPerfectSquare(i));
        }
    }
}
