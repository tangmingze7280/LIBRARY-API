package com.sbmybatis.mytestdemo.collection;

import java.util.*;

public class Main {
    public static void  main(String args[]){
        Scanner san=new Scanner(System.in);
        String x= "hhbbcc";
        String a= "aabbcc";
        System.out.println();//97-122

    }
    public int nice(int pep,Queue<Integer> queue){
        return 0;
    }
/*    public static String checkChat(String x){
        StringBuffer sb=new StringBuffer("");
        List<Integer> list=new ArrayList<>();
        char[] c=x.toCharArray();
        for (char cr:c){
            list.add((int)cr);
        }
        for(int i=0;i<list.size();i++){
            if(list.indexOf((int)c[i])!=-1&&list.lastIndexOf((int)c[i])!=-1){
                sb.append(c[i]);
            }

        }
        return null;
}*/
    /*public static int  test1(int pay){
        if(pay>1024)
            return 0;
        int sum=1024;
        int shengyu=sum-pay;
        int num=0;
        if(shengyu<1)
            return num;
        if(shengyu<3)
            return shengyu;
        if(4<shengyu&&shengyu<16)
            return shengyu/4+shengyu%4;
        if(16<shengyu&&shengyu<64)
            return shengyu/16+shengyu%16/4+shengyu%16%4;
        return shengyu/64+shengyu%64/16+shengyu%64%16/4+shengyu%64%16%4;
    }*/
}
