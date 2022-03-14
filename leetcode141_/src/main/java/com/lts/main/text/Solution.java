package com.lts.main.text;

import java.util.Arrays;

class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        // 如果两个数组的差距很大，就把nums1和num2中最相差最大的依次变化

        // 获取num1和num2的和值

        int sum1=0;

        int sum2=0;

        for(int i=0;i<nums1.length;i++){
            sum1+=nums1[i];
        }

        for(int i=0;i<nums2.length;i++){
            sum2+=nums2[i];
        }

        int cha=Math.abs(sum1-sum2);
        // 分别求出每个元素还可以加多少或减多少
        // 判断哪个和大进行相应操作
        if(sum1==sum2){
            return 0;
        }
        else if(sum1>sum2){
            // 判断sum1中每个元素都可以减小多少
            int[] min=new int[nums1.length+nums2.length];
            for(int i=0;i<nums1.length;i++){
                min[i]=nums1[i]-1;
            }
            int j=0;
            for(int i=nums1.length;i<=nums1.length+nums2.length-1;i++){
                min[i]=6-nums2[j];
                j++;
            }

            Arrays.sort(min);

            int res=0;

            for(int i=min.length-1;i>=0;i--){
                res++;
                cha-=min[i];
                if(cha<=0){
                    return res;
                }
            }
        }
        else if(sum1<sum2){
            return minOperations(nums2,nums1);
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.minOperations(new int[]{5,2,1,5,2,2,2,2,4,3,3,5}, new int[]{1,4,5,5,6,3,1,3,3}));
    }
}
