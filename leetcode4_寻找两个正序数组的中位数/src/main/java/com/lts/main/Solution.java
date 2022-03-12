package com.lts.main;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length+nums2.length];

        for (int i = 0; i <nums1.length+nums2.length ; i++) {
            if(i>=nums1.length){
                result[i]=nums2[i-nums1.length];
                continue;
            }
            result[i]=nums1[i];
        }

        Arrays.sort(result);
        return result.length%2==0?(double) (result[result.length/2-1]+result[result.length/2])/2:(double) result[result.length/2];
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }
}
