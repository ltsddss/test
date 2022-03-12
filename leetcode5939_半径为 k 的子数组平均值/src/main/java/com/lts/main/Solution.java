package com.lts.main;

import java.util.Arrays;

public class Solution {

    /**
     * 傻逼题，不解释，emmm，通过了，就不傻逼了
     * @param nums
     * @param k
     * @return
     */
    public int[] getAverages(int[] nums, int k) {

        if(k==0){
            return nums;
        }

        int[] result=new int[nums.length];

        Long avg=0L;
        if(k>nums.length){
            for (int i = 0; i < nums.length; i++) {
                result[i]=-1;
            }

            return result;
        }
        else {

        for (int i = 0; i < k; i++) {
            result[i]=-1;
        }

        for (int i = k; i < nums.length-k; i++) {
            if(i==k){
                for (int j = i-k; j < (i-k)+2*k+1; j++) {
                    avg+=nums[j];
                }
            }else {
                avg=avg-nums[i-k-1];
                avg=avg+nums[(i-k)+2*k];
            }

            result[i]=(int)(avg/(2*k+1));
        }

        for (int i = nums.length-k; i < nums.length; i++) {
            result[i]=-1;
        }
        return result;
        }
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(Arrays.toString(s.getAverages(new int[]{7,4,3,9,1,8,5,2,6}, 3)));
    }
}
