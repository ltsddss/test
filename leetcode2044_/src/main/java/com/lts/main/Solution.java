package com.lts.main;

// TODO: 未通过
public class Solution {
    public int countMaxOrSubsets(int[] nums) {
        // 二次循环分割出子集
        // 设置结果值，判断是否为最大

        int res=0;

        int result=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int temp=0;
                temp=isMax(nums,i,j);
                if(temp>res){
                    res=temp;
                    result=1;
                }
                else if(temp==res){
                    result++;
                }
            }
        }

        return result;
    }

    public int isMax(int[] nums,int start,int end){

        if(end==start){
            return nums[start];
        }

        int res=0;

        for(int i=start;i<=end;i++){
            res|=nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.countMaxOrSubsets(new int[]{3, 1}));
    }
}
