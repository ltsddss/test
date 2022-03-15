package com.lts.main.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: 超时
public class Solution {
    public int maxDistance(int[][] grid) {

        int length = 0;
        int length1 = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, List<Integer>> map1 = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
//                把所有陆地存起来
                if (grid[i][j] == 1) {
                    List<Integer> list = new ArrayList<>();
//                    横坐标
                    list.add(i);
//                    纵坐标
                    list.add(j);
                    map.put(length, list);
                    length++;
                }
                else {
//                    把海洋存入
                    List<Integer> list = new ArrayList<>();
                    //                    横坐标
                    list.add(i);
//                    纵坐标
                    list.add(j);
                    map1.put(length1, list);
                    length1++;
                }
            }
        }

//        如果都为陆地或者海洋，则返回false
        if (map.size() == 0 || map1.size()==0) {
            return -1;
        }

        int res=0;
//        循环map
        for (int i = 0; i < map1.size(); i++) {
            int temp=100;
            for (int j = 0; j < map.size(); j++) {
                int hm=Math.abs(map.get(j).get(0)-map1.get(i).get(0))+Math.abs(map.get(j).get(1)-map1.get(i).get(1));
                if(temp>hm){
                    temp=hm;
                }
            }
            if(res<temp){
                res=temp;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.maxDistance(new int[][]{new int[]{1, 0, 1}, new int[]{0, 0, 0}, new int[]{1, 0, 1}}));
    }
}
