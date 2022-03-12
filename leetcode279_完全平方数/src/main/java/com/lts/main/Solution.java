package com.lts.main;

import java.util.ArrayList;
import java.util.List;

//  一眼看去，必是贪心(我是傻逼) 四平方和定理
//解决
public class Solution {
    public int numSquares(int n) {

        int x=n;

        while(x%4==0){
            x/=4;
        }
        if(x%8==7){
            return 4;
        }
        x=n;
        if((int)Math.sqrt(x)*Math.sqrt(x)==x){
            return 1;
        }

        for (int i = 1; i <Math.sqrt(x) ; i++) {
            for (int j = 1; j < Math.sqrt(x); j++) {
                if((i*i+j*j)==x){
                    return 2;
                }
            }
        }

        return 3;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.numSquares(50));
    }
}
