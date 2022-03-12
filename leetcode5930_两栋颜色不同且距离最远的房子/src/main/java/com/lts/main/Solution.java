package com.lts.main;

public class Solution {
    public int maxDistance(int[] colors) {

        int result=0;

        int max=0;

        for (int i = 0; i <colors.length ; i++) {
            for (int j = colors.length-1; j >i ; j--) {
                if(colors[j]!=colors[i]){
                    max=j-i;
                    if(max>result){
                        result=max;
                    }
                    break;
                }

            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.maxDistance(new int[]{0,1}));
    }
}
