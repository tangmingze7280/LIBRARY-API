package com.sbmybatis.mytestdemo.iodemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner scanner=new Scanner(System.in);
        String str=new Scanner(System.in).nextLine();
        char[] chars=str.toCharArray();
        String aim="";
        for(int i=0;i<chars.length;i++){
            int paIndex=i;
            int a=2;
            String x="";
            while (paIndex+1<chars.length&&chars[paIndex]==chars[paIndex+1]){
                x=chars[paIndex]+""+a;
                paIndex++;
                a++;
            }
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
                aim+=chars[i];
            aim+=x;
            i=paIndex;
        }
        System.out.println(aim);
    }
}
