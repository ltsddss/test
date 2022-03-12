package com.lts.main;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
 *
 * 返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
 *
 *
 */
//妙啊 只和结尾的数字有关，怪不得我老是越界
public class Solution {
    public static List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> result=new ArrayList<Boolean>();
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num<<=1;
            num+=nums[i];
            num%=10;
            result.add(num%5==0);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,0,1,1,1,1,0,0,0,0,1,0,0,0,0,0,1,0,0,1,1,1,1,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,1,0,0,1,1,1,1,1,1,0,1,1,0,1,0,0,0,0,0,0,1,0,1,1,1,0,0,1,0};

        System.out.println(Solution.prefixesDivBy5(nums));
    }
}
