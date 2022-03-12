package com.lts.main;

public class Solution {
    public int maxPower(String s) {

        int count=1;
        int max=0;

        for (int i = 1; i <s.length() ; i++) {
            count+=s.charAt(i)==s.charAt(i-1)?1:-count+1;

            max=Math.max(max,count);
        }

        return Math.max(max,count);
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.maxPower("j"));
    }
}
