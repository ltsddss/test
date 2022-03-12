package com.lts.main;

import java.util.Arrays;

public class Solution {

    /**
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSubsequence(int[] nums, int k) {
        int[] temp=new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i]=nums[i];
        }

        Arrays.sort(temp);

        int[] result=new int[k];

        int m=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = temp.length-k; j < temp.length; j++) {
                if(temp[j]==nums[i]){
                    result[m]=nums[i];
                    m++;
                    temp[j]=11111111;
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution=new Solution();

        System.out.println(Arrays.toString(solution.maxSubsequence(new int[]{-1,-2,3,4}, 3)));
    }
}
