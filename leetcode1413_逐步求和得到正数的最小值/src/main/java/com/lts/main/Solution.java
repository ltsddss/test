package com.lts.main;

/**
 * 给你一个整数数组 nums 。你可以选定任意的 正数 startValue 作为初始值。
 *
 * 你需要从左到右遍历 nums 数组，并将 startValue 依次累加上 nums 数组中的值。
 *
 * 请你在确保累加和始终大于等于 1 的前提下，选出一个最小的 正数 作为 startValue 。
 */
//通过
public class Solution {
    public static int minStartValue(int[] nums) {
        int temp = 1;
        for (int start = 1;; start++) {
            temp=start;
            for (int i = 0; i <nums.length ; i++) {
                if((temp+=nums[i])<1){
                    break;
                }
                if(i==nums.length-1){
                    return start;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,-2,-3};

        System.out.println(Solution.minStartValue(nums));
    }
}
