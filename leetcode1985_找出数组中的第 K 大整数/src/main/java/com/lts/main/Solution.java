package com.lts.main;

import java.util.Arrays;

/**
 * 给你一个字符串数组 nums 和一个整数 k 。nums 中的每个字符串都表示一个不含前导零的整数。
 *
 * 返回 nums 中表示第 k 大整数的字符串。
 *
 * 注意：重复的数字在统计时会视为不同元素考虑。
 * 例如，如果 nums 是 ["1","2","2"]，那么 "2" 是最大的整数，"2" 是第二大的整数，"1" 是第三大的整数。
 */

/**
 * 狗比leetcode会把参数设的非常大，所以别想要用Integer.parseLong("")来转换字符串，操
 */

public class Solution{
    /**
     * 题解思路： 先比较字符串的长度有需要的话，再比较相同长度的大小
     * @param nums
     * @param k
     * @return
     */

//    操，学到了学到了
    public static String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o1.length() - o2.length());
        return nums[nums.length - k];

    }
}

//public class Solution {
//    public static String kthLargestNumber(String[] nums, int k) {
//
//        Long[] temp=new Long[nums.length];
//
//        for (int i = 0; i <nums.length ; i++) {
//            temp[i]=Long.parseLong(nums[i]);
//        }
//
//        Arrays.sort(temp);
//        Long[] result=new Long[nums.length];
//
//        for (int i = temp.length-1,j=0; i >=0 ; i--,j++) {
//            result[j]=temp[i];
//        }
//
//        return ""+result[k-1];
//    }
//
//    public static void main(String[] args) {
//        String[] nums=new String[]{"623986800","3","887298","695","794","6888794705","269409","59930972","723091307","726368","8028385786","378585"};
//
//        System.out.println(Solution.kthLargestNumber(nums,11));
//
//    }
//}
