package com.lts.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */

class MapSum {

    Map<String,Integer> map=new HashMap<String, Integer>();

    List<String> list=new ArrayList<String>();

    public MapSum() {

    }

    public void insert(String key, int val) {
        if(map.get(key)==null){
            list.add(key);
            map.put(key,val);
        }
        else {
            map.put(key,val);
        }
    }

    public int sum(String prefix) {
        int result=0;

        for (String s : list) {
            if(s.indexOf(prefix)==0){
                result=result+map.get(s);
            }
        }
        return result;
    }
}
