package com.lts.main;

import java.util.ArrayList;
import java.util.List;

// 辗转相除法
public class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> list=new ArrayList<String>();
        for (int i = 2; i <=n ; i++) {
            for (int j = 1; j <i ; j++) {
                if(gcd(i,j)==1){
                    list.add(j +"/"+ i);
                }
            }
        }

        return list;

    }

    public int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.simplifiedFractions(4));
    }
}
