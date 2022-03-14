package com.lts.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> map=new HashMap<>();
        List<String> list0=new ArrayList<>();
//      将list1中的值和索引存入一个map中
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }

//      与list2进行对比，找到最小的索引
        int length=2000;

        for(int i=0;i<list2.length;i++){
            if(i>length){
                break;
            }
            if(map.containsKey(list2[i])){
                int tmpmin=map.get(list2[i])+i;
                if(tmpmin<length){
                    list0.clear();
                }

                if(tmpmin<=length){
                    length=tmpmin;
                    list0.add(list2[i]);
                }
            }
        }
        return list0.toArray(new String[list0.size()]);

    }
}
