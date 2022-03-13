package com.lts.main;

public class Solution {
    /**
     *
     * @param data 传入的data数组，判断是否为合法的utf-8编码文件
     * @return 返回正确或错误
     */
    public boolean validUtf8(int[] data) {
        /**
         * 解题思路：
         */
//        将data处理为一个二进制的字符数组
//        判断第一个元素开头有多少个一，如果为0，就跳到下一个元素
//        如果有一个1，返回false
//        如果有2个一判断之后的元素是否以01开头（是的话跳转到下一个元素，否则为false）
//        如果有3个一判断之后的2个元素是否以01开头（是的话跳转到下一个元素，否则为false）
//        如果有4个一判断之后的3个元素是否以01开头（是的话跳转到下一个元素，否则为false）

        String temp="";

        for (int i = 0; i < data.length; i++) {
            temp=Integer.toBinaryString(data[i]);

            while(temp.length()<8){
                temp="0"+temp;
            }

            if(temp.charAt(0)=='0'){
            }
            else if(temp.substring(0,3).equals("110")){
                try{
                    temp=Integer.toBinaryString(data[i+1]);

                    while(temp.length()<8){
                        temp="0"+temp;
                    }
                    if(Integer.toBinaryString(data[i+1]).substring(0,2).equals("10")){
                        i++;
                    }else {
                        return false;
                    }
                }catch (Exception e){
                    return false;
                }

            }
            else if(temp.substring(0,4).equals("1110")){

                try {
                    temp=Integer.toBinaryString(data[i+1]);

                    while(temp.length()<8){
                        temp="0"+temp;
                    }
                    if(temp.substring(0,2).equals("10")){
                        temp=Integer.toBinaryString(data[i+2]);

                        while(temp.length()<8){
                            temp="0"+temp;
                        }
                        if(temp.substring(0,2).equals("10")){
                            i=i+2;
                        }
                        else {
                            return false;
                        }
                    }else {
                        return false;
                    }
                }catch (Exception e){
                    return false;
                }

            }
            else if(temp.substring(0,5).equals("11110")){

                try {
                    temp=Integer.toBinaryString(data[i+1]);

                    while(temp.length()<8){
                        temp="0"+temp;
                    }
                    if(temp.substring(0,2).equals("10")){
                        temp=Integer.toBinaryString(data[i+2]);

                        while(temp.length()<8){
                            temp="0"+temp;
                        }
                        if(temp.substring(0,2).equals("10")){
                            temp=Integer.toBinaryString(data[i+3]);

                            while(temp.length()<8){
                                temp="0"+temp;
                            }
                            i=i+3;
                        }
                        else {
                            return false;
                        }
                }else {
                        return false;
                    }

                }catch (Exception e){
                    return false;
                }

            }
            else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.validUtf8(new int[]{197,3,4}));
    }
}
