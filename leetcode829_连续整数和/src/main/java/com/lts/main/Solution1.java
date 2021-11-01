package com.lts.main;

public class Solution1 {

    public static int consecutiveNumbersSum(int n) {
        int res = 0;
        for (int i = 1; n > 0; n -= i++) {
            if(n % i == 0){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Solution1.consecutiveNumbersSum(15));
    }

}
