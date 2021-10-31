package com.lts.main;

/**
 * 解决
 *
 */
class Solution {

    private static final String One="qwertyuiop";

    private static final String two="asdfghjkl";

    private static final String three="zxcvbnm";

    public static String[] findWords(String[] words) {
        // 暴力循环
        int index=0;
        String[] result=new String[words.length];

        for(int i=0;i<words.length;i++){
            int a=0;
            int b=0;
            int c=0;
            String temp=words[i].toLowerCase();

            for(int j=0;j<temp.length();j++){
                if(One.indexOf(temp.charAt(j))!=-1){
                    a++;
                }
                else if(two.indexOf(temp.charAt(j))!=-1){
                    b++;
                }
                else if(three.indexOf(temp.charAt(j))!=-1){
                    c++;
                }
                if(a==temp.length()&&b==0&&c==0||a==0&&b==temp.length()&&c==0||a==0&&b==0&&c==temp.length()){
                    result[index]=words[i];
                    index++;
                }
            }
        }

        String[] sosu=new String[index];

        for (int i = 0; i < result.length; i++) {
            if(result[i]!=null) {
                sosu[i]=result[i];
            }
        }

        return sosu;
    }

    public static void main(String[] args) {
        String[] question=new String[]{"Hello","Alaska","Dad","Peace"};

        String[] result=Solution.findWords(question);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
