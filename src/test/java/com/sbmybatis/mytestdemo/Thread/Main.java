package com.sbmybatis.mytestdemo.Thread;

import java.util.Scanner;

/**
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。
 * 你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 */
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
//        int n=5;
        int n1=1;
        int n2=2;
        System.out.println(sumPoint(n,n1,n2));
        //4---5
        //5---8
    }
    public static int sumPoint(int n,int a,int b){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if (n==2)
            return 2;
        int[] x=new int[n];
        x[0]=1;
        x[1]=2;

        if(n>2){
            for (int i=2;i<x.length;i++){
                x[i]=x[i-1]+x[i-2];
            }
        }
        return x[n-1];
    }
}
