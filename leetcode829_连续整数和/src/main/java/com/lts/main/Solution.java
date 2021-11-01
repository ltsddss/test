package com.lts.main;

/**
 * 给定一个正整数 N，试求有多少组连续正整数满足所有数字之和为 N?
 */
// 超出时间限制 ，很难受
public class Solution {
    public static int consecutiveNumbersSum(int n) {
        int result=1;
        for (int i = 1; i <=n/2 ; i++) {
            int sum=i;
            for (int j = i+1; j <=n/2+1 ; j++) {
                if((sum+=j)>n){
                    break;
                }
                else if(sum==n){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Solution.consecutiveNumbersSum(15));
    }
}
