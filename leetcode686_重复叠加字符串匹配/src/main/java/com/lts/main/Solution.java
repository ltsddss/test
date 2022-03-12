package com.lts.main;

public class Solution {
    /**
     * 返回最小的a
     * @param a
     * @param b
     * @return
     * 超出时间限制
     */
    public int repeatedStringMatch(String a, String b) {

        int sum=1;

        String temp=a;

        for (int i = 0; i <b.length() ; i++) {

            if(temp.contains(b)){
                return sum;
            }
            sum++;
            temp=temp+a;
        }

        return -1;

    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.repeatedStringMatch("abc","cabcabca"));
    }
}
