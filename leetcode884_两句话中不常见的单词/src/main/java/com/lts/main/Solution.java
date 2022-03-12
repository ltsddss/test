package com.lts.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        int length = 0;

        List<String> list = new ArrayList<String>();
        s1 = s1 + " " + s2+" ";
        String ss = "";
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                length++;
            }
        }
        String[] temp = new String[length];

        for (int j = 0; j < s1.length(); j++) {
            if (s1.charAt(j) != ' ') {
                ss += s1.charAt(j);
            } else {
                list.add(ss);
                ss="";
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            temp[i]=list.get(i);
        }
        list.clear();
        int flag=0;

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp.length; j++) {
                if (i == j) {
                    continue;
                }
                else if(temp[i].equals(temp[j])){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                list.add(temp[i]);
            }
            flag=0;
        }

        String[] result=new String[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            result[i]=list.get(i);

        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String s1 = "apple apple";

        String s2 = "banana";

        System.out.println(Arrays.toString(s.uncommonFromSentences(s1, s2)));
    }
}
