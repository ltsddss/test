package com.lts.main;

public class Solution {
    private long dp = 0;
    private long sum = 0;
    public long countVowels(String word) {
        if (isValid(word.charAt(0))) {
            dp = 1;
            sum += dp;
        }
        for (int i = 1; i < word.length(); i++) {
            if (isValid(word.charAt(i))) {
                dp += (i + 1);
            }
            sum += dp;
        }
        return sum;
    }

    private boolean isValid(char c) {
        return c == 'a' || c == 'e' || c== 'o' || c == 'i' || c == 'u';
    }
}
