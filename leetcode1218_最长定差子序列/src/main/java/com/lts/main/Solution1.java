package com.lts.main;

import java.util.HashMap;

// 没怎么看懂
public class Solution1 {
    public int longestSubsequence(int[] arr, int difference) {
        int max = 1;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            Integer val = map.get(arr[i] - difference);
            if(val != null){
                map.put(arr[i],val+1);
                max = max >= val+1 ? max : val+1;
            }
            else {
                map.put(arr[i],1);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2,3,4};

        Solution1 s = new Solution1();
        System.out.println(s.longestSubsequence(arr, 1));
    }
}
