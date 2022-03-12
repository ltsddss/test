package com.lts.main;

// 超出内存限制，又是一道数学题
public class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int[][] M=new int[m][n];

        for (int i = 0; i <ops.length ; i++) {
            for (int j = 0; j <ops[i][0] ; j++) {
                for (int k = 0; k <ops[i][1] ; k++) {
                    M[j][k]++;
                }
            }
        }

        int max=M[0][0];
        int result=0;


        for (int i = 0; i <M.length ; i++) {
            for (int j = 0; j <M[i].length ; j++) {
                if(max==M[i][j]){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        int[][] ops=new int[][]{{2,2},{3,3}};

        System.out.println(s.maxCount(3, 3, ops));
    }
}
