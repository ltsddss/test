package com.lts.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//  真他妈变态，操，不会
public class Solution {
    public String countOfAtoms(String formula) {
        String temp="1";
        Map<String,Integer> map=new HashMap<String, Integer>();

        for (int i = 0; i <formula.length() ; i++) {
//            判断这个字符是什么
            if(formula.charAt(i)!='('&&formula.charAt(i)!=')'){
                if(map.get(String.valueOf(formula.charAt(i)))==null){
//                    如果不存在该键，则看后面的数字是多少
                    for (int j = i+1; Character.isDefined(formula.charAt(j)); j++) {
                        temp+=formula.charAt(j);
//                        这行代码决定formula.charAt(i)不可能为数字
                        i=j;
                    }
                    map.put(String.valueOf(formula.charAt(i)),Integer.parseInt(temp));
                    temp="";

                }
                else {
//                    如果存在 看后面是否有数字
                    for (int j = i+1; Character.isDefined(formula.charAt(j)); j++) {
                        temp+=formula.charAt(j);
                        i=j;
                    }
//                    本来的数量加上后面数字的数量
                    map.put(String.valueOf(formula.charAt(i)),map.get(String.valueOf(formula.charAt(i))+Integer.parseInt(temp)));
                }
            }
//            当遇见括号的时候
            else {
                Stack<String> stack=new Stack<String>();

                for (int j = i; j < formula.length(); j++) {
                    if(formula.charAt(j)=='('){

                    }
                }
            }
        }

        return null;
    }
}
