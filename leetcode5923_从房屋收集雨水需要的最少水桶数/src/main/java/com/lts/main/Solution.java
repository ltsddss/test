package com.lts.main;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int minimumBuckets(String street) {
//        思路，将street拆分，如果达到两个连续的空位就可以拆开，操，思路怎么和归并排序这么像
        /**
         * 记录".."的位置，然后拆开
         */

        List<Integer> list=new ArrayList<Integer>();

        for (int i = 0; i <street.length()-2 ; i++) {
            if(street.substring(i,i+2).equals("..")){
                list.add(i);
            }
        }
        return 9;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.minimumBuckets("H..H"));
    }
}
