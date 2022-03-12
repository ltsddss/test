package com.lts.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        List<Integer> list=new ArrayList<Integer>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                list.add(i);
            }
        }

        return list;
    }
}
