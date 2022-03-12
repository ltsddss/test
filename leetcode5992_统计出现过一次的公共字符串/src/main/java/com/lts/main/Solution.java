package com.lts.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//      通过
public class Solution {
    /**
     * @param words1
     * @param words2
     * @return
     */
    public int countWords(String[] words1, String[] words2) {

        Map<String,Integer> result=new HashMap<String, Integer>();

        int results=0;

        for (int i = 0; i <words1.length ; i++) {
            for (int j = 0; j < words2.length; j++) {
                if(words1[i].equals(words2[j])&&result.get(words1[i])==null){
                    result.put(words1[i],1);
                }
                else if(words1[i].equals(words2[j])&&result.get(words1[i])!=null){
                    result.put(words1[i],result.get(words1[i])+1);

                }
            }
        }

        for (String s : words1) {
            if(result.get(s)!=null&&result.get(s)==1){
                results++;
            }
        }

        return results;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.countWords(new String[]{"b","a","a","a","ab"}, new String[]{"a","ab"}));
    }
}
