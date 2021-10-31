package com.lts.main;

/**
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 *
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 *
 * 如果数组中存在多个幸运数，只需返回 最大 的那个。
 * 如果数组中不含幸运数，则返回 -1 。
 */
//通过
public class Solution {
    public static int findLucky(int[] arr) {
        int max=-1;
        for (int i=0;i<arr.length;i++){
            int current=0;
            for (int j = 0; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    current++;
                }
            }
            if(current>max&&current==arr[i]){
                max=current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{7,7,7,7,7,7,7};

        System.out.println(Solution.findLucky(arr));
    }
}
