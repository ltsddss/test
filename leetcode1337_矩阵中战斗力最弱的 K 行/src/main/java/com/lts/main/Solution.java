package com.lts.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。
 * <p>
 * 请你返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。
 * <p>
 * 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。
 * <p>
 * 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。
 */
public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
//      TODO 带更改
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> temp = new ArrayList<Integer>();
        int[] result = new int[k];

        for (int i = 0; i < mat.length; i++) {
            list.add(0);
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    break;
                }

                list.set(i, list.get(i) + mat[i][j]);

            }
        }
        //每一次找到最小的元素放在中专数组里面
        int min=list.get(0);//最小元素
        int flag=0;//位置
        for (int j = 0; j < k; j++) {
            for (int i = 0; i <list.size(); i++) {
                if(min>list.get(i)){
                    min=list.get(i);
                    list.remove(i);
                }
            }
            temp.add(min);
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if(temp.get(i).equals(list.get(j))){
                    result[i]=j;
                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] mat = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        System.out.println(Arrays.toString(s.kWeakestRows(mat, 3)));
    }
}
