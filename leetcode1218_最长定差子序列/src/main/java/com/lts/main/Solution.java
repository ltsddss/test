package com.lts.main;

import java.util.Arrays;

/**
 * 超出时间限制,但是在数据小的时候可行
 */
public class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int result = 1;
        for (int i = 0; i < arr.length; i++) {
            int flag = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - flag == difference) {
                    result++;
                    flag = arr[j];
                }
            }
            arr[i] = result;
            result = 1;

        }
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7, 8, 5, 3, 4, 2, 1};

        Solution s = new Solution();
        System.out.println(s.longestSubsequence(arr, -2));
    }
}
