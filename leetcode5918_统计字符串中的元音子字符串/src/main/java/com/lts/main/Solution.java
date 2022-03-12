package com.lts.main;

import java.util.HashSet;

// 通过
public class Solution {
    public int countVowelSubstrings(String word) {

        int result=0;

        HashSet<String> set=new HashSet<String>();

        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
                set.add(String.valueOf(word.charAt(i)));
                for (int j = i+1; j <word.length() ; j++) {
                    if(word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u'){
                        set.add(String.valueOf(word.charAt(j)));
                        if(set.size()==5){
                            result++;
                        }
                    }else {
                        break;
                    }
                }
            }
            set.clear();
        }


        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.countVowelSubstrings("unicornarihan"));
    }
}
