package com.lts.main;

public class Solution {
    public int wateringPlants(int[] plants, int capacity) {
//        浇水是从河边开始的
        int man=capacity;

        int result=0;

        for (int i = 0; i < plants.length; i++) {
            if(capacity>=plants[i]){
                result++;
                capacity=capacity-plants[i];
            }
            else {
                i--;
                result=result+(i+1)*2;
                capacity=man;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.wateringPlants(new int[]{7,7,7,7,7,7,7}, 8));
    }
}
