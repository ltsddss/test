package com.lts.main;

import java.util.Stack;
//  待解答
public class Solution {

    int result=0;

    public int maximumGain(String s, int x, int y) {
        Stack<String> stack=new Stack<String>();

        stack.push(""+s.charAt(0));

        if(x>y){
            for (int i = 1; i <s.length() ; i++) {
                if("ab".equals(stack.peek()+s.charAt(i))){
                    result+=x;
                    stack.pop();
                }
                else {
                    stack.push(""+s.charAt(i));
                }
            }
        }
        else {
            return 1;
        }

return 1;
    }
}
