package com.lts.main;

import java.util.Arrays;

public class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int result=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=0){
                nums[i]=-nums[i];
                k--;
                if(k==0){
                    break;
                }
            }
            else if(i==0&&nums[i]>0&&k>0){
                nums[i]=-nums[i];
                k--;
                if(k==0){
                    break;
                }
                i--;
            }
            else if(nums[i]>0&&k>0){
                if(nums[i]>nums[i-1]){
                    nums[i-1]=-nums[i-1];
                    k--;
                    i--;
                }
                else {
                    nums[i]=-nums[i];
                    k--;
                    i--;
                }
                if(k==0){
                    break;
                }
            }
        }
        while (k!=0){
            nums[nums.length-1]=-nums[nums.length-1];
            k--;
        }

        for (int num : nums) {
            result += num;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.largestSumAfterKNegations(new int[]{-4,-2,-3}, 4));
    }
}
