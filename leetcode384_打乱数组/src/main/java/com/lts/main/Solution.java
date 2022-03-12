package com.lts.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//      通过
public class Solution {

    int[] nums;

    public Solution(int[] nums) {
        this.nums=nums;
    }

//    还原数组
    public int[] reset() {
        return nums;
    }
//      随机打乱数组
    public Object[] shuffle() {
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 0; i <nums.length ; i++) {
            list.add(nums[i]);
        }

        Collections.shuffle(list);

        return list.toArray();
    }

    public static void main(String[] args) {
        Solution s=new Solution(new int[]{1,2,3});

        System.out.println(Arrays.toString(s.shuffle()));

        System.out.println(Arrays.toString(s.reset()));

        System.out.println(Arrays.toString(s.shuffle()));
    }
}
