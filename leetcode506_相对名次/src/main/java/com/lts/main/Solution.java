package com.lts.main;

import java.util.Arrays;


//      通过，但是时间和空间都不理想
public class Solution {
    /**
     *
     * @param score
     * @return
     */
    public String[] findRelativeRanks(int[] score) {

        int[] temp=new int[score.length];

        String[] result=new String[score.length];

        System.arraycopy(score, 0, temp, 0, score.length);

        Arrays.sort(temp);

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if(score[i]==temp[j]&&j==score.length-1){
                    result[i]="Gold Medal";
                }
                else if(score[i]==temp[j]&&j==score.length-2){
                    result[i]="Silver Medal";
                }
                else if(score[i]==temp[j]&&j==score.length-3){
                    result[i]="Bronze Medal";
                }
                else if(score[i]==temp[j]){
                    result[i]=""+(score.length-j);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(Arrays.toString(s.findRelativeRanks(new int[]{5,4,3,2,1})));
    }
}
