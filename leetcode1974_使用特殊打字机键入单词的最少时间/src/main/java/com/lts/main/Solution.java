package com.lts.main;

public class Solution {
    public int minTimeToType(String word) {
        int res = 0, dis = 0;
        char start = 'a';
        char[] cc = word.toCharArray();
        for (char c : cc) {
            dis = Math.abs(c - start);
            res += Math.min(dis, 26 - dis);
            start = c;
        }
        return res + cc.length;
    }
}
