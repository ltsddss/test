package com.lts.main;

/**
 * 心态崩了，这是什么？？？？
 * 不贴题了，纯数学问题
 */
public class Solution {

    public boolean divisorGame(int n) {
        return n%2==0;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();

        System.out.println(solution.divisorGame(20));
    }
}
