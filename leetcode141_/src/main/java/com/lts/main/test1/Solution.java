package com.lts.main.test1;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public int sumOfUnique(int[] nums) {

        if(nums.length==1){
            return nums[0];
        }

        if(nums.length==2){
            if(nums[0]==nums[1]){
                return 0;
            }
            else{
                return nums[0]+nums[1];
            }
        }



        Arrays.sort(nums);
        int res=nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==nums[i-1]||nums[i]==nums[i+1]){
                continue;
            }
            else{
                res+=nums[i];
            }
        }

        if(nums[nums.length-1]!=nums[nums.length-2]){
            res=res+nums[nums.length-1];
        }
        if(nums[0]==nums[1]){
            res-=nums[0];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.sumOfUnique(new int[]{10,4,10,9,5}));
    }
}
