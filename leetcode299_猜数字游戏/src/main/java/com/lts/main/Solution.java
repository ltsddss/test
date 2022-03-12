package com.lts.main;

// 出错，没有理解题意 待修正
public class Solution {
    public String getHint(String secret, String guess) {

        int a=0;
        int b=0;

        for (int i = 0; i <secret.length() ; i++) {
            if(secret.charAt(i)==guess.charAt(i)){
                a++;
                secret=secret.substring(0,i)+"&"+secret.substring(i+1);
            }
            else if(secret.indexOf(guess.charAt(i))!=-1){
                b++;
                secret=secret.substring(0,secret.indexOf(guess.charAt(i))-1)+"&"+secret.substring(secret.indexOf(guess.charAt(i)));
            }
        }

        return a+"A"+b+"B";
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.getHint("011", "110"));
    }
}
