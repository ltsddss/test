package com.lts.main;

import java.util.Arrays;

public class Solution {

    int[] arr;

    public void RangeFreqQuery(int[] arr) {
        Arrays.sort(arr);
        this.arr=arr;
    }

    public int query(int left, int right, int value) {

        int result=0;

        int[] re=arr;
        Arrays.sort(re,left,right+1);

        for (int i = left; i <=right; i++) {
            if(re[i]>value){
                break;
            }
            if(re[i]==value){
                result++;
            }
        }

        return result;
    }
}
