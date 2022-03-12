package com.lts.main;

public class Solution {
    public ListNode deleteMiddle(ListNode head) {

        int length=1;
        ListNode temp=head;
        ListNode result=head;

        while (temp.next!=null){
            length++;
            temp=temp.next;
        }

        if(length==1){
            return null;
        }
        if(length==2){
            head.next=null;
            return head;
        }

        int mid=length/2;

        for (int i = 0; i <mid-1 ; i++) {
            head=head.next;
        }

        head.next=head.next.next;

        return result;
    }
}
