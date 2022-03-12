package com.lts.main;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组 互不相同 的单词， 找出所有 不同 的索引对 (i, j)，使得列表中的两个单词， words[i] + words[j]
 * ，可拼接成回文串。
 */

// 超出时间限制，但是方法可行 真尼玛恶心
public class Solution {
    public static List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> result=new ArrayList<List<Integer>>();

        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j <words.length ; j++) {
                if(isPairs(words[i]+words[j])&&i!=j){
                    List<Integer> list=new ArrayList<Integer>();

                    list.add(i);
                    list.add(j);
                    result.add(list);
                }
            }
        }
        return result;

    }

    public static Boolean isPairs(String word){
        if(word.length()%2==0){
            int start=word.length()/2-1;
            int end=start+1;

            for(;start>=0&&end<word.length();start--,end++){
                if(word.charAt(start)!=word.charAt(end)){
                    return false;
                }
            }
            return true;
        }
        else {
            int start=word.length()/2-1;
            int end=start+2;

            for(;start>=0&&end<word.length();start--,end++){
                if(word.charAt(start)!=word.charAt(end)){
                    return false;
                }
            }
            return true;
        }

    }

    public static void main(String[] args) {
        String[] words=new String[]{"a","abc","aba",""};

        System.out.println(Solution.palindromePairs(words));
    }
}
