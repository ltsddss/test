package com.lts.main;

public class Solution {
    public String truncateSentence(String s, int k) {

        String result="";

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                result+=s.charAt(i);
            }
            else {
                k--;
                if(k==0){
                    break;
                }
                result+=' ';
            }
        }
        return result;
    }

    public String truncateSentencesecond(String s, int k) {

        String result="";
        s+=" ";
        while (k!=0){
            int index=s.indexOf(' ');

            result+=s.substring(0,index)+" ";
            k--;

            if(k==0){
                return result.substring(0,result.length()-1);
            }
            s=s.substring(index+1);
        }

        return "";
    }

    public String truncateSentencethird(String s, int k) {

        int flag=0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                k--;
                if(k==0){
                    flag=i;
                    break;
                }
            }
        }
        return k==0?s.substring(0,flag):s;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.truncateSentencethird("Hello how are you Contestant", 4));


    }
}
