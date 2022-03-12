package com.lts.main;

import java.util.Arrays;

//      通过
public class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1){
            return stones[0];
        }
        Arrays.sort(stones);

        while (true){
            if(stones[stones.length-1]>stones[stones.length-2]){
                stones[stones.length-1]=stones[stones.length-1]-stones[stones.length-2];
                stones[stones.length-2]=0;
            }
            else if(stones[stones.length-1]==stones[stones.length-2]){
                stones[stones.length-1]=0;
                stones[stones.length-2]=0;
            }
            Arrays.sort(stones);
            if(stones[stones.length-2]==0){
                break;
            }
        }
        return stones[stones.length-1];
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
