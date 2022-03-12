package com.lts.main;

// 通过
public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if(start==destination){
            return 0;
        }
        int result1 = 0;

        int result2 = 0;

        if(start<destination){
            for (int i = start; i <destination ; i++) {
                result1+=distance[i];
            }
            for (int i = 0; i < start; i++) {
                result2+=distance[i];
            }
            for (int i = destination; i < distance.length; i++) {
                result2+=distance[i];
            }

            return Math.min(result1, result2);
        }
        else {
            return distanceBetweenBusStops(distance,destination,start);
        }
    }
}
