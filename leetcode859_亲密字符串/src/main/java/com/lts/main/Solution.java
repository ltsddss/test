package com.lts.main;

//      通过
public class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length()!=goal.length()||s.length()==1){
            return false;
        }
        if(!s.equals(goal)) {
            int num1=-1;
            int num2=0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)!=goal.charAt(i)){
                    if(num1==-1){
                        num1=i;
                    }else {
                        num2=i;
                        break;
                    }
                }
            }
            if(num2==0){
                return false;
            }
            return (s.substring(0,num1)
                    +s.substring(num2,num2+1)
                    +s.substring(num1+1,num2)
                    +s.substring(num1,num1+1)
                    +s.substring(num2+1)).equals(goal);
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i+1; j <s.length() ; j++) {
                    if(s.charAt(i)==s.charAt(j)){
                        return true;
                    }
                }
            }

            return false;
        }
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.buddyStrings("abc", "abc"));
    }
}
