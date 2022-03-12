package com.lts.main;

// 超出时间限制
public class Solution1 {
    public long countVowels(String word) {
        Long result =0L;

        String temp="";

//        拆分字串
        for (int i = 0; i <word.length() ; i++) {
            for (int j = i; j <word.length() ; j++) {
                temp=temp+word.charAt(j);
                result+=isyy(temp);
            }
            temp="";
        }

        return result;
    }
    public Long isyy(String str){
        Long result=0L;
        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                result++;
            }
        }

        return result;
    }
}
