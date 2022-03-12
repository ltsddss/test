package com.lts.main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] findEvenNumbers(int[] digits) {

        int sum=0;

        Set<Integer> set=new HashSet<Integer>();

        for (int i = 0; i < digits.length; i++) {
            if(digits[i]!=0){
                sum=digits[i]*100;
                for (int j = 0; j < digits.length; j++) {
                    if(j==i){
                        continue;
                    }
                    sum=sum+digits[j]*10;

                    for (int k = 0; k < digits.length; k++) {
                        if(k==j||k==i){
                            continue;
                        }
                        if(digits[k]%2==0){
                            sum=sum+digits[k];

                            set.add(sum);
                            sum=sum-digits[k];
                        }
                    }
                    sum=sum-digits[j]*10;
                }
            }
        }
        int[] result=new int[set.size()];
        int i=0;

        for (Integer integer : set) {
            result[i]=integer;
            i++;
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(Arrays.toString(s.findEvenNumbers(new int[]{0,0,0})));
    }
}
