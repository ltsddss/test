package com.lts.main;

import java.util.Arrays;

//题出的有毛病
public class Solution {
    public int findMin(int[] nums) {
        Arrays.sort(nums);

        return nums[0];
    }
}
