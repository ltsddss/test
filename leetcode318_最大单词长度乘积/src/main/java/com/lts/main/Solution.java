package com.lts.main;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int maxProduct(String[] words) {

        int max=0;

        for (int i = 0; i <words.length ; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].length()*words[j].length()>max&&isEqual(words[i],words[j])){
                    max=words[i].length()*words[j].length();
                }
            }
        }

        return max;
    }

//    判断字符串是否有相同的字母
    public boolean isEqual(String word1,String word2){
        for (int i = 0; i <word1.length() ; i++) {
            if(word2.contains(""+word1.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.maxProduct(new String[]{"eae", "ea", "aaf", "bda", "fcf", "dc", "ac", "ce", "cefde", "dabae"}));
    }
}
