package com.lts.main;

import java.util.*;

public class Solution {
    /** TODO: 审题出错
     *
     * @param licensePlate
     * @param words
     * @return
     */
    public String shortestCompletingWord(String licensePlate, String[] words) {

        String temp=licensePlate.toLowerCase();

        List<String> list=new ArrayList<String>();

        String s1="";

        for (int i = 0; i <temp.length() ; i++) {
            if(temp.charAt(i)!=' '&&!Character.isDigit(temp.charAt(i))){
                s1=s1+temp.charAt(i);

            }
        }
        char[] charss=s1.toCharArray();

        Arrays.sort(charss);

        String s3=new String(charss);

        for (int i = 0; i < words.length; i++) {
            char[] chars=words[i].toCharArray();

            Arrays.sort(chars);

            String s2=new String(chars);
            if(s2.contains(s3)){
                list.add(words[i]);
            }
        }

        if(list.size()==1){
            return list.get(0);
        }

        int min=0;

        for (int i = 1; i <list.size() ; i++) {
            if(list.get(min).length()>list.get(i).length()){
                min=i;
            }
        }

        return list.get(min);
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.shortestCompletingWord("Ah71752", new String[]{"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"}));
    }
}
