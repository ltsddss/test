package com.lts.main;

public class Solution {
    public boolean isRobotBounded(String instructions) {
        //  方向：0表示向上，1表示向右，2表示向下，3表示向左
        int d=0;
//        x轴方向的距离
        int x=0;
//        y轴方向的距离
        int y=0;
        while(true){
            for (int i = 0; i < instructions.length(); i++) {
                if(instructions.charAt(i)=='R'){
                    d++;
                }
                else if(instructions.charAt(i)=='L'){
                    d--;
                }
                else {
                    if((d%4)==-1){
                        x--;
                    }
                    if((d%4)==-2){
                        y--;
                    }
                    if((d%4)==-3){
                        x++;
                    }
                    if((d%4)==0){
                        y++;
                    }
                    if((d%4)==1){
                        x++;
                    }
                    if((d%4)==2){
                        y--;
                    }
                    if((d%4)==3){
                        x--;
                    }
                }
            }
            if(d%4==0){
                break;
            }
        }


        return x==0&&y==0;
    }

    public static void main(String[] args) {
        Solution s=new Solution();

        System.out.println(s.isRobotBounded("GGGRRRGGLLLRRGLRGLLRG"));
    }
}
