package com.lts.main;

// 通过
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int result=0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (i == timeSeries.length - 1) {
                result += duration;
                break;
            }
            if (timeSeries[i] + duration > timeSeries[i + 1]) {
                result = result + timeSeries[i + 1] - timeSeries[i];
            }
            if (timeSeries[i] + duration <= timeSeries[i + 1]) {
                result = result + duration;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.findPoisonedDuration(new int[]{1,4},2));
    }
}
