package com.lts.main.test2;

import java.util.Arrays;

public class Solution {
    public long wonderfulSubstrings(String word) {

        long count=0L;

        for (int i = 0; i < word.length()-1; i++) {
            for (int j = i+1 ; j <= word.length(); j++) {
                if(iswonder(word.substring(i,j))){
                    count++;
                }
            }
        }

        return count;
    }

    public Boolean iswonder(String word){

        if(word.length()==1){
            return true;
        }
        char[] ss=word.toCharArray();

        int res=0;

        Arrays.sort(ss);

        for (int i = 0; i < ss.length; i++) {
            int count=0;
            for (int j = i; j < ss.length-1; j++) {
                if(ss[j]!=ss[j+1]){
                    count++;
                }
            }
            if(count%2==1){
                res++;
            }
        }

        return res<=1?true:false;
    }

    public static void main(String[] args) {
        Solution a=new Solution();

        System.out.println(a.wonderfulSubstrings("aabb"));
    }
}
