package com.lts.main;

public class Solution {
    public int integerReplacement(int n) {
        long temp=n;
        int count=0;
        while(temp!=1){
            if((temp&3)==3&&temp!=3){
                temp++;
            }
            else if((temp&1)==1){
                temp--;
            }
            else{
                temp=temp>>1;
            }
            count++;
        }
        return count;
    }
}
