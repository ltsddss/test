package com.lts.main;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycle(ListNode head) {

        Set<Integer> set =new HashSet<>();

        int length=0;

        while(head!=null){
            set.add(head.hashCode());
            length++;
            if(set.size()!=length){
                return false;
            }
        }
        return true;
    }
}
