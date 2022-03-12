package com.lts.main;

import java.util.Arrays;

public class Solution {
//    超时，淦
    public long subArrayRanges(int[] nums) {

        long sum=0L;

        for (int i = 1; i <nums.length ; i++) {
            for (int j = 0; j+i < nums.length; j++) {
                int newArray[] = Arrays.copyOfRange(nums, j, j+i+1);

                Arrays.sort(newArray);
                sum+=newArray[newArray.length-1]-newArray[0];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.subArrayRanges(new int[]{1,3,3}));
    }
}
