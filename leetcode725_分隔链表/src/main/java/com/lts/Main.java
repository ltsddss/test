package com.lts;

//          给你一个头结点为 head 的单链表和一个整数 k ，请你设计一个算法将链表分隔为 k 个连续的部分。
//
//        每部分的长度应该尽可能的相等：任意两部分的长度差距不能超过 1 。这可能会导致有些部分为 null 。
//
//        这 k 个部分应该按照在链表中出现的顺序排列，并且排在前面的部分的长度应该大于或等于排在后面的长度。
//
//        返回一个由上述 k 部分组成的数组。


//TODO: 还有缺点，再看
public class Main {

    public ListNode[] splitListToParts(ListNode head, int k) {

        ListNode listNode1 = head;
        //设置一个ListNode的长度
        int length = 0;

        //遍历head获得长度
        while (listNode1.next != null) {
            length++;
            listNode1 = listNode1.next;
        }
        //如果想让每个数组的长度误差不超过1，所以需要将余数拿出来,a表示有多少个会超过别的数组多一个
        int a = length % k;

        //获得每个数组的长度
        int b=length/k;

        ListNode[] list = new ListNode[k];

        ListNode listNode2 = new ListNode();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b+1; j++) {
                listNode2 = head;
                listNode2 = listNode2.next;
                head = head.next;
            }
            list[i] = listNode2;
        }

        for (int i = a; i < k; i++) {
            for (int j = 0; j < b; j++) {
                listNode2 = head;
                listNode2 = listNode2.next;
                head = head.next;
            }
            list[i] = listNode2;
        }

        return list;
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(0);
    }
}
