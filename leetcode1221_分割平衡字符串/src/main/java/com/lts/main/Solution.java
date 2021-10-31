package com.lts.main;

/**
 * 在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
 *
 * 给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
 *
 * 注意：分割得到的每个字符串都必须是平衡字符串，且分割得到的平衡字符串是原平衡字符串的连续子串。
 *
 * 返回可以通过分割得到的平衡字符串的 最大数量 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//测试
public class Solution {
    public static int balancedStringSplit(String s) {
        int num=0;
        int result=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='R'){
                num++;
            }
            else {
                num--;
            }
            if (num==0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s="RLRRLLRLRL";

        int i = Solution.balancedStringSplit(s);

        System.out.println(i);
    }
}
