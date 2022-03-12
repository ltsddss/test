package com.lts.main;

import java.util.Arrays;
import java.util.Map;

public class Solution {
    public int minimumDeletions(int[] nums) {
        int[] temp=new int[nums.length];

        for (int i = 0; i <nums.length ; i++) {
            temp[i]=nums[i];
        }

        Arrays.sort(temp);

        int min=temp[0];
        int result=0;

        int max=temp[temp.length-1];

        int flagmin=0;

        int flagmax=0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==min){
                flagmin=i;
            }
            if(nums[i]==max){
                flagmax=i;
            }
        }

        if(flagmax>=flagmin){
            result=flagmax+1;
            if(result>flagmin+1+nums.length-flagmax){
                result=flagmin+1+nums.length-flagmax;
            }
            if(result>nums.length-flagmin){
                result=nums.length-flagmin;
            }
        }
        else {
            result=flagmin+1;
            if(result>flagmax+1+nums.length-flagmin){
                result=flagmax+1+nums.length-flagmin;
            }
            if(result>nums.length-flagmax){
                result=nums.length-flagmax;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.minimumDeletions(new int[]{-14,61,29,-18,59,13,-67,-16,55,-57,7,74}));
    }
}
