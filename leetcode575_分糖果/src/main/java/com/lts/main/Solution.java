package com.lts.main;

import java.util.HashSet;

/**
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。
 * 你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 */
//通过 这他妈算算法吗？？？
public class Solution {
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i : candyType) {
            set.add(i);
        }
        return Math.min(set.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        int[] candyType=new int[]{1,1,2,3};

        System.out.println(Solution.distributeCandies(candyType));
    }
}
