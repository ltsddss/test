package com.lts.main;


/**
 * 不使用库函数的解法
 * idea有指令重拍，不过leetcode好像禁止指令重排，真有意思
 */
public class Solution1 {
    public boolean isPerfectSquare(int num) {
        int temp=1;
        int sum=0;
        while (sum<num){
            sum+=temp;
            temp+=2;
        }
        if(sum==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.isPerfectSquare(49));
    }
}
