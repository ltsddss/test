package com.lts.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {

        Map<Character, Integer> map=new HashMap<Character, Integer>();
        Map<Character, Integer> map1=new HashMap<Character, Integer>();

        int result=0;

        String str="";
        String str1="";

        for (int i = 0; i <word1.length() ; i++) {
            if(map.get(word1.charAt(i))==null){
                str=str+word1.charAt(i);
                map.put(word1.charAt(i),1);
            }
            else {
                map.put(word1.charAt(i),map.get(word1.charAt(i))+1);
            }
        }
        for (int i = 0; i <word2.length() ; i++) {
            if(map1.get(word2.charAt(i))==null){
                str1=str1+word2.charAt(i);
                map1.put(word2.charAt(i),1);
            }
            else {
                map1.put(word2.charAt(i),map1.get(word2.charAt(i))+1);
            }
        }
        for (int i = 0; i <str.length() ; i++) {
            if(map1.get(str.charAt(i))==null){
                if(map.get(str.charAt(i))>3){
                    return false;
                }
            }
            else if(Math.abs(map.get(str.charAt(i))-map1.get(str.charAt(i)))>3){
                return false;
            }
        }
        for (int i = 0; i <str1.length() ; i++) {
            if(map.get(str1.charAt(i))==null){
                if(map1.get(str1.charAt(i))>3){
                    return false;
                }
            }
            else if(Math.abs(map1.get(str1.charAt(i))-map.get(str1.charAt(i)))>3){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.checkAlmostEquivalent("dasdas", "sdfaf"));
    }
}
