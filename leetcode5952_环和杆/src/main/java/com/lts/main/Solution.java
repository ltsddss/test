package com.lts.main;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countPoints(String rings) {
        Map<Integer,String> map=new HashMap<Integer, String>();

        int result=0;

        for (int i = 1; i < rings.length(); i+=2) {
            if(map.get(rings.charAt(i)-'0')==null){
                map.put(rings.charAt(i)-'0',rings.charAt(i-1)+"");
            }
            else {
                map.put(rings.charAt(i)-'0',map.get(rings.charAt(i)-'0')+rings.charAt(i-1));
            }
        }

        for (int i = 0; i <=9; i++) {
            if(map.get(i)==null){
                continue;
            }
            if(map.get(i).contains("R")&&map.get(i).contains("G")&&map.get(i).contains("B")){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.countPoints("B9R9G0R4G6R8R2R9G9"));
    }
}
