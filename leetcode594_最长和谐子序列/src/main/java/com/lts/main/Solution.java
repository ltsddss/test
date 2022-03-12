package com.lts.main;

import java.util.Arrays;

public class Solution {
    public int findLHS(int[] nums) {
//      排序后使用双指针的方式
        Arrays.sort(nums);
        int begin = 0,res = 0;
        for(int end = 0;end < nums.length;end++){
            while(nums[end] - nums[begin] > 1) {
                begin++;
            }
            if(nums[end] - nums[begin] == 1) {
                res = Math.max(res,end - begin + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
    }
}
