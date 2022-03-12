package com.lts.main;

import java.util.ArrayList;
import java.util.List;

public class Solution {
//    超时但是可行
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> list=new ArrayList<Integer>();

        if(time==0){
            for (int i = 0; i <security.length ; i++) {
                list.add(i);
            }

            return list;
        }
        if(security.length<2*time+1){
            return list;
        }

        int flag=0;

        for (int i = time; i < security.length-time; i++) {
            for (int j = i-time; j < i; j++) {
                if (security[j] < security[j + 1]) {
                    flag = 1;
                    break;
                }
            }
            for (int j = i; j < i+time; j++) {
                if(security[j]>security[j+1]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                list.add(i);
            }
            flag=0;
        }

        return list;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.goodDaysToRobBank(new int[]{1,2,5,4,1,0,2,4,5,3,1,2,4,3,2,4,8}, 2));
    }
}
