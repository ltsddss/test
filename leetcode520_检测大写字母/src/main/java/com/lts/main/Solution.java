package com.lts.main;

//  通过
public class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toUpperCase().equals(word)){
            return true;
        }
        if(word.toLowerCase().equals(word)){
            return true;
        }
        if(((""+word.charAt(0)).toLowerCase()+word.substring(1)).equals(word.toLowerCase())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.detectCapitalUse("U"));
    }
}
