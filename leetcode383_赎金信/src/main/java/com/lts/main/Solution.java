package com.lts.main;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int result=0;

        for (int i = 0; i <ransomNote.length() ; i++) {
            if(magazine.contains(""+ransomNote.charAt(i))){
                result++;
                int index=magazine.indexOf(ransomNote.charAt(i));
                magazine=magazine.substring(0,index)+"A"+magazine.substring(index+1);
            }else {
                return false;
            }
        }

        return result==ransomNote.length();
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.canConstruct("aa", "ba"));
    }
}
