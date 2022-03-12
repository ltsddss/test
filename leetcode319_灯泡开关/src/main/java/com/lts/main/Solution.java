package com.lts.main;

//      思路没错，但是超出时间限制
public class Solution {
    public int bulbSwitch(int n) {

        if(n==0){
            return 0;
        }

//        0表示不亮，1表示亮
        int result=0;
        int[] temp=new int[n];

        for (int i = 0; i <n; i++) {
            for (int j = i; j <n ; j+=(i+1)) {
                if(temp[j]==0){
                    temp[j]=1;
                }
                else {
                    temp[j]=0;
                }
            }
        }

        temp[0]=1;

        for (int i = 0; i <n ; i++) {
            if(temp[i]==1){
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.bulbSwitch(3));
    }
}
