package com.lts.main;

import java.util.*;
//      超出时间限制，但是思路没错
public class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {

//        把所有的物品价格和美丽值对应起来
        Map<Integer,Integer> map=new HashMap<Integer, Integer>();

        int max=0;

        List<Integer> list1=new ArrayList<Integer>();

        int[] result=new int[queries.length];

        for (int i = 0; i <items.length ; i++) {
            if(map.get(items[i][0])==null){
                list1.add(items[i][0]);
                map.put(items[i][0],items[i][1]);
            }
            else {
                map.put(items[i][0],Math.max(map.get(items[i][0]),items[i][1]));
            }
        }
//        把
        for (int i = 0; i < queries.length; i++) {
            for (Integer integer : list1) {
                if(integer>queries[i]){
                    continue;
                }
                if(max<map.get(integer)){
                    max=map.get(integer);
                }
            }
            result[i]=max;
            max=0;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(Arrays.toString(s.maximumBeauty(new int[][]{{1, 2}, {3, 2},{2,4},{5,6},{3,5}}, new int[]{1, 2, 3,4,5,6})));
    }
}
